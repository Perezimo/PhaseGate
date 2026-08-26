public class ParkingLot{
   

    static int [] parkingSlots = new int[20];
    public static int checkSlots(){
        return parkingSlots.length;    
    }

    public static int checkAvailability(int slotNumber){
        if(slotNumber>20 || slotNumber < 0 ){ 
            System.out.print("Invalid slot number");
            return -1;
            }
        return parkingSlots[slotNumber-1];
    }


    public static String parkWithNumber(int slotNumber){
        if(checkAvailability(slotNumber) == 1) {
        return "Slot is occupied!!!";
        }
        parkingSlots[slotNumber-1] = 1;
        return "Car Parked";
    }

    public static int parkWithoutNumber(){
        for(int count = 0;count< parkingSlots.length; count++){
        if(parkingSlots[count] == 0){
                parkingSlots[count] = 1;
                return  count + 1;
            }
    }
    return -1;
    }

    public static String unPark(int slotNumber){
        if(checkAvailability(slotNumber) == 0){
            return "No car parked at specified slot!!!";
        }
        parkingSlots[slotNumber - 1] = 0;
        return "Car unparked";
    }

    public static int[] carPark(){
        return parkingSlots;
    }

    
}

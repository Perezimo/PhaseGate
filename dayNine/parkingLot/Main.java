import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String menu = """
        1. Park
        2. UnPark
        3. Exit
""";
        String subMenu = """
        Do you have a parking slot?(Y/N)
        """;
        boolean condition = true;
        while(condition){
            for(int count=0; count< ParkingLot.parkingSlots.length; count+=10){
                for(int counter=count;counter<count+10; counter++){
                    System.out.print(ParkingLot.parkingSlots[counter] + "\t");
                }
                System.out.println();
            }
            System.out.println(menu);
            int option = scanner.nextInt();
            switch(option){
            case 1-> {
            System.out.println(subMenu);
            char subOption = scanner.next().charAt(0);
                switch(Character.toUpperCase(subOption)){
                    case 'Y'->{
                            System.out.println("Enter your parking slot number: ");
                            int slotNumber = scanner.nextInt();
                            System.out.println(ParkingLot.parkWithNumber(slotNumber));
                        }
                    case 'N'->System.out.println(ParkingLot.parkWithoutNumber());
                }
            }
            case 2-> {
                System.out.println("Enter your slot number: ");
                int slotNumber = scanner.nextInt();
                System.out.println(ParkingLot.unPark(slotNumber));
            }
            case 3-> condition = false;
            default -> System.out.println("enter a valid option!!!");
            }
        }
    }
}

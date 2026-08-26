import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ParkingLotTest{
//    ParkingLot parkingLot = new ParkingLot();
    @Test
    void testThat_slotExists(){
     int actual = ParkingLot.checkSlots();
    int expected =20;
     assertEquals(actual, expected);
    }

    @Test
    void testThat_IGetSlotStatus(){
        int actual = ParkingLot.checkAvailability(7);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void testThat_InValidInput_IsNotAccepted(){
            int accepted = -1; assertEquals(accepted,ParkingLot.checkAvailability(30));
        assertEquals(accepted,ParkingLot.checkAvailability(-10));


    }
    @Test
    void testThat_CarCanPark_IHaveSlotNumber(){
        assertEquals(0, ParkingLot.checkAvailability(10));
        ParkingLot.parkWithNumber(10);
        assertEquals(1, ParkingLot.checkAvailability(10));
        
    }

    @Test
    void testThat_CarCanPark_WithoutSlotNumber(){
        int slotNumber = ParkingLot.parkWithoutNumber();
        assertEquals(1, ParkingLot.checkAvailability(slotNumber));
    }
    @Test
    void testThat_CarCanUnPark(){
        assertEquals(0, ParkingLot.checkAvailability(11));
        ParkingLot.parkWithNumber(11);
        assertEquals(1, ParkingLot.checkAvailability(11));
        ParkingLot.unPark(11);
        assertEquals(0, ParkingLot.checkAvailability(11));
        
    }
}


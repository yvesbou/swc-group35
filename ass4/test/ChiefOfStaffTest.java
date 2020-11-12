import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiefOfStaffTest {


    void getNewIDTest() {
        int firstID = ChiefOfStaff.getNewID();
        int secondID =  ChiefOfStaff.getNewID();
        assertFalse(firstID== secondID);
    }


    void isCityTakenTest(String city) {
        assertFalse(ChiefOfStaff.isCityTaken(city));
        ChiefOfStaff.addCity(city);
        assertTrue(ChiefOfStaff.isCityTaken(city));

    }


    void addCityTest(String city) {
        String message;
        message = ChiefOfStaff.addCity(city);
        assertTrue(ChiefOfStaff.isCityTaken(city));
        assertEquals("Successfully added new City",message);
        message = ChiefOfStaff.addCity(city);
        assertTrue(ChiefOfStaff.isCityTaken(city));
        assertEquals("This city is already taken.",message);

    }

    @Test
    void main(){
        getNewIDTest();
        isCityTakenTest("Paris");
        addCityTest("Riga");
        assertTrue(true);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiefOfStaffTest {

    @Test
    void getNewID() {
        int firstID = ChiefOfStaff.getNewID();
        int secondID =  ChiefOfStaff.getNewID();
        assertFalse(firstID== secondID);
    }

    @Test
    void isCityTaken(String city) {
        assertFalse(ChiefOfStaff.isCityTaken(city));
        ChiefOfStaff.addCity(city);
        assertTrue(ChiefOfStaff.isCityTaken(city));

    }

    @Test
    void addCity(String city) {

    }

    @Test
    void main(){

    }
}
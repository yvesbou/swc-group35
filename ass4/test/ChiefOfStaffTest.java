import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the test class for the ChiefOfStaff class and all it's methods.
 */
class ChiefOfStaffTest {


    /**
     * Tests the getNewID function which returns a newID for a staff member
     *
     * The test covers if the method returns unique IDs for every staff member
     *
     * This test does not need any parameters and can be called without instance since ChiefOfStaff is abstract
     *
     */
    void getNewIDTest() {
        int firstID = ChiefOfStaff.getNewID();
        int secondID =  ChiefOfStaff.getNewID();
        assertFalse(firstID == secondID);
    }


    /**
     * Tests the isCityTaken function which returns a boolean to state whether a provided city has
     * already a section chief.
     *
     * The test covers if the method returns false given that the city was not taken yet
     * The following parameter is needed to perform this test:
     * @param city
     */
    void isCityTakenFalseTest(String city) {
        assertFalse(ChiefOfStaff.isCityTaken(city));

    }

    /**
     * Tests the isCityTaken function which returns a boolean to state whether a provided city has
     * already a section chief.
     *
     * The test covers if the method returns true given that the city was taken
     * The following parameter is needed to perform this test:
     * @param city
     */
    void isCityTakenTrueTest(String city) {
        ChiefOfStaff.addCity(city);
        assertTrue(ChiefOfStaff.isCityTaken(city));
    }

    /**
     * Tests the addCity function which returns a String and adds the city to a vector within Chief of
     * Staff class.
     *
     * This test covers if the method returns the correct string when provided with a new city name
     * The following parameter is needed to perform this test:
      * @param city
     */
    void addnewCityTest(String city) {
        String message;
        message = ChiefOfStaff.addCity(city);
        assertEquals("Successfully added new City.",message);}

    /**
     * Tests the addCity function which returns a String and adds the city to a vector within Chief of
     * Staff class.
     *
     * This test covers if the method returns the correct string when provided with a existing city name
     * The following parameter is needed to perform this test:
     * @param city
     */
    void addExistingCityTest(String city) {
        String message;
        message = ChiefOfStaff.addCity(city);
        assertEquals("This city is already taken.",message);}



    @Test
    /**
     * runs all the tests of this class
     */
    void main(){
        getNewIDTest();
        isCityTakenFalseTest("Paris");
        isCityTakenTrueTest("Paris");
        addnewCityTest("Riga");
        addExistingCityTest("Riga");
        assertTrue(true);
    }
}
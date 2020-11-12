import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This is the test class for the WebTechnician class and all it's methods.
 */
class WebTechnicianTest {

    /**
     * Test the constructor of the WebTechnician.
     * This method test the name and the surname get set correctly in
     * the constructor of the constructorTest.
     *
     * This test covers:
     * the constructor of WebTechnician
     * getName method
     * gerSurname method
     *
     * @param name
     * @param surname
     */
    void constructorTest(String name, String surname){
        WebTechnician webTechnician = new WebTechnician(name, surname);
        assertEquals(name, webTechnician.getName());
        assertEquals(surname, webTechnician.getSurname());
    }

    /**
     * This method test the fixWebsite method of the WebTechnician class.
     * It test if the method returns the correct String.
     *
     * This test covers:
     *the fixWebstite method
     */
    void fixWebsiteTest() {
        WebTechnician webTechnician = new WebTechnician("Maximilian", "Schnieke");
        assertEquals("reparations complete", webTechnician.fixWebsite());

    }

    @Test
    /**
     * runs all the tests of this class
     */
    void main(){
        constructorTest("Thomas", "Bühler");
        fixWebsiteTest();
        assertTrue(true);
    }
}
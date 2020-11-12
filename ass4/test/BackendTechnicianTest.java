import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the test class for the BackendTechnician class and all it's methods.
 */
class BackendTechnicianTest {

    /**
     * Tests the fixBackend function which prints fixed given an ID of a technician
     *
     * This test covers:
     * if the fixBackend returns the correct String "fixed"
     *
     * @param technicianID
     */
    void fixBackendTest(int technicianID) {
        BackendTechnician backendTechnician = new BackendTechnician("Thomas","Jefferson");
        assertEquals("fixed!",backendTechnician.fixBackend(technicianID));
    }

    /**
     * Tests the constructor of the BackendTechnician.
     * This method tests if the name and the surname get set correctly in
     * the constructor of the constructorTest.
     *
     * This test covers:
     * the constructor of BackendTechnician
     * getName method
     * getSurname method
     *
     * @param name
     * @param surname
     */
    void ConstructorTest(String name, String surname ) {
        BackendTechnician backendTechnician = new BackendTechnician(name,surname);
        assertEquals(name, backendTechnician.getName());
        assertEquals(surname, backendTechnician.getSurname());
    }
    @Test
    /**
     * runs all the tests of this class
     */
    void main(){
        ConstructorTest("Elvis","Presley");
        BackendTechnician backendTechnician = new BackendTechnician("Thomas","Jefferson");
        fixBackendTest(backendTechnician.getID());
        assertTrue(true);
    }
}
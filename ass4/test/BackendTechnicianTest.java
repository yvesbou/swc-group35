import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BackendTechnicianTest {

    @Test
    void fixBackendTest(int technicianID) {
        BackendTechnician backendTechnician = new BackendTechnician("Thomas","Jefferson");
        assertEquals("fixed!",backendTechnician.fixBackend(technicianID));
    }
    @Test
    void BackendTechnicianTest(String name, String surname ) {
        BackendTechnician backendTechnician = new BackendTechnician(name,surname);
        assertEquals(name, backendTechnician.getName());
        assertEquals(surname, backendTechnician.getSurname());
    }
    @Test
    void main(){
        BackendTechnicianTest("Elvis","Presley");
        fixBackendTest(100);
        assertTrue(true);
    }
}
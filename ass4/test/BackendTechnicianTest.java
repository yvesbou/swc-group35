import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BackendTechnicianTest {

    @Test
    void fixedTest(int technicianID) {
        BackendTechnician backendTechnician = new BackendTechnician("Thomas","Jefferson");
        assertEquals("fixed!",backendTechnician.fixed(technicianID));
    }
    @Test
    void BackendTechnicianTest(String ) {
        BackendTechnician backendTechnician = new BackendTechnician("Thomas","Jefferson");
        assert
    }
    @Test
    void main(){
        fixedTest(100);
        assertTrue(true);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTechnicianTest {

    @Test
    void fixTest() {
        WebTechnician webTechnician = new WebTechnician("Hans", "Ueli");
        assertEquals("reparations complete", webTechnician.fix());

    }

    @Test
    void main(){
        fixTest();
        assertTrue(true);
    }
}
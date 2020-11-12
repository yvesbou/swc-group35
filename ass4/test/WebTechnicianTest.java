import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTechnicianTest {

    @Test
    void constructorTest(String name, String surname){
        WebTechnician webTechnician = new WebTechnician(name, surname);
        assertEquals(name, webTechnician.getName());
        assertEquals(surname, webTechnician.getSurname());
    }

    @Test
    void fixTest() {
        WebTechnician webTechnician = new WebTechnician("Maximilian", "Schnieke");
        assertEquals("reparations complete", webTechnician.fixWebsite());

    }

    @Test
    void main(){
        fixTest();
        assertTrue(true);
    }
}
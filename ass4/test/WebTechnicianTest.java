import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTechnicianTest {


    void constructorTest(String name, String surname){
        WebTechnician webTechnician = new WebTechnician(name, surname);
        assertEquals(name, webTechnician.getName());
        assertEquals(surname, webTechnician.getSurname());
    }


    void fixWebsiteTest() {
        WebTechnician webTechnician = new WebTechnician("Maximilian", "Schnieke");
        assertEquals("reparations complete", webTechnician.fixWebsite());

    }


    void main(){
        constructorTest("Thomas", "Bühler");
        fixWebsiteTest();
        assertTrue(true);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {

    @Test
    void getNewSerialNumberTest() {
        int first = CreditCardValidation.getNewSerialNumber();
        int second = CreditCardValidation.getNewSerialNumber();
        assertNotEquals(first,second);
    }

    @Test
    void getNewSecurityNumberTest() {
        int first = CreditCardValidation.getNewSecurityNumber();
        int second = CreditCardValidation.getNewSecurityNumber();
        assertNotEquals(first,second);
        assertTrue(first >=100 && first <=999);
    }
}
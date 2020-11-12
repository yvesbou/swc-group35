import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class contains test methods, covering the methods of the CreditCardValidation Class.
 */
class CreditCardValidationTest {
    /**
     * This test method covers the getNewSerialNumber of the CreditCardValidation Class.
     *
     * It tests, if we get different Serial Numbers, if we run the getNewSerialNumber
     * method two times in a row.
     */
    @Test
    void getNewSerialNumberTest() {
        int first = CreditCardValidation.getNewSerialNumber();
        int second = CreditCardValidation.getNewSerialNumber();
        assertNotEquals(first,second);
    }
    /**
     * This test method covers the getNewSecurityNumber of the CreditCardValidation Class.
     *
     * It tests, if we get different Security Numbers, if we run the getNewSecurityNumber
     * method two times in a row.
     */
    @Test
    void getNewSecurityNumberUniqueTest() {
        int first = CreditCardValidation.getNewSecurityNumber();
        int second = CreditCardValidation.getNewSecurityNumber();
        assertNotEquals(first,second);
    }

    /**
     * This test method Covers the getNewSecurityNumber method of the CreditCardValidation Class.
     *
     * It tests, if the Security number has 3 digits.
     */
    @Test
    void getNewSecurityNumber3DigitsTest() {
        int first = CreditCardValidation.getNewSecurityNumber();
        assertTrue(first >=100 && first <=999);
    }
}
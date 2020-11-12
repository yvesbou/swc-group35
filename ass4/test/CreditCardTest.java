import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class contains test methods covering the Credit Card Class
 */
class CreditCardTest {
    /**
     * This test method covers the isExpired method of the CreditCard Class.
     *
     * The first argument given to the constructor of the CreditCard Class is
     * the number of years in which the card will expire.
     * A Card with first positional argument 1 should not be expired.
     *
     * This test method tests, if the card is not expired.
     */
    @Test
    void isExpiredWithCardWhichShouldNotBeExpiredTest() {
        //testing if credit card can be expired.
        CreditCard regularCard = new CreditCardRegular(1,"Joe","Biden");
        assertFalse(regularCard.isExpired());
    }

    /**
     * This test method covers the isExpired method of the CreditCard Class.
     *
     * It tests if a CreditCard instance expiring today is expired.
     * A CreditCard instance expiring in 0 years should be expired.
     */
    @Test
    void isExpiredWithCardWhichShouldBeExpiredTest(){
        CreditCard regularCard = new CreditCardRegular(0,"Joe","Biden");
        assertTrue(regularCard.isExpired());
    }

    /**
     * This test method covers the setSerialNumber method of the CreditCard method.
     *
     * It tests if the attribute serialNumber of two CreditCard instances created
     * consecutively differs.
     */
    @Test
    void setSerialNumberTest() {
        CreditCard regularCard1 = new CreditCardRegular(1,"Kamala","Harris");
        CreditCard regularCard2 = new CreditCardRegular(1,"Kamala","Harris");
        //testing if two cards can have the same number.
        assertFalse(regularCard1.getSerialNumber() == regularCard2.getSerialNumber());


    }
    /**
     * This test method covers the setSecurityNumber method of the CreditCard method.
     *
     * It tests if the attribute securityNumber of two CreditCard instances created
     * consecutively differs.
     */
    @Test
    void setSecurityNumberTest() {
        CreditCard regularCard1 = new CreditCardRegular(1, "Kamala", "Harris");
        CreditCard regularCard2 = new CreditCardRegular(1, "Kamala", "Harris");
        //testing if two cards can have the same number.
        assertFalse(regularCard1.getSecurityNumber() == regularCard2.getSecurityNumber());

    }

    /**
     * This test method covers the setSecurityNumber method of the CreditCard method.
     *
     * It test, if the attribute securityNumber of a CreditCardInstance has 3 digits.
     */
    @Test
    void setSecurityNumber3Digits(){
        CreditCard regularCard1 = new CreditCardRegular(1, "Kamala", "Harris");
        //testing if two cards can have the same number.
        //testing if security number has 3 digits;
        assertTrue(regularCard1.getSecurityNumber() >= 100 && regularCard1.getSecurityNumber() <= 999);
    }

    /**
     * This test method covers the setExpirationDate method of the CreditCardClass
     *
     * It test, if the attribute expirationDate is of type Date.
     * @param year
     */
    void setExpirationDateTest(int year) {
        CreditCard regularCard1 = new CreditCardRegular(1, "Kamala", "Harris");
        //check if expiration Date is of type Date
        assertTrue(regularCard1.getExpirationDate() instanceof Date);
    }

    /**
     * This test covers the getLimit method of the CreditCard Class.
     *
     * It tests, if the limit of a credit card created gets set to the correct value.
     */
    @Test
    void getLimitTest() {
        CreditCard regularCard1 = new CreditCardRegular(1, "Kamala", "Harris");
        assertEquals(2000, regularCard1.getLimit());
    }

    /**
     * this method runs all the tests with parameters.
     */
    @Test
    void main(){
        setExpirationDateTest(1);
    }
}


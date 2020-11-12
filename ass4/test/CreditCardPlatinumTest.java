import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This test Class contains test methods covering the method of the CreditCardPlatinum Class
 */
class CreditCardPlatinumTest {
    /**
     * This method covers the constructor of the CreditCardPlatinum Class.
     *
     * It test if the arguments passed to the constructor are stored as attributes of the instance
     * and can be retrieved by getters.
     */
    @Test
    void constructorTest(){
        CreditCard platinum = new CreditCardPlatinum(1,"Olaf","Schubert");
        assertEquals("Olaf",platinum.getName());
        assertEquals("Schubert",platinum.getSurname());
        assertTrue(platinum instanceof CreditCardPlatinum);
    }
    /**
     * This test method covers the setLimit method of the CreditCardPlatinum class.
     *
     * The protected method setLimit will be called in the constructor of the CreditCardPlatinumClass.
     * It must assign 10000 to the attribute limit.
     *
     * This test method will test, if the set limit method can set the limit field to 10000.
     */
    @Test
    void setLimitTest() {
        CreditCard platinum = new CreditCardPlatinum(1,"Olaf","Schubert");
        assertEquals(10000,platinum.getLimit());
    }
}
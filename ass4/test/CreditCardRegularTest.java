import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test Class contains test methods covering the method of the CreditCardRegular Class
 */
class CreditCardRegularTest {
    /**
     * This method covers the constructor of the CreditCardRegular Class.
     *
     * It test if the arguments passed to the constructor are stored as attributes of the instance
     * and can be retrieved by getters.
     */
    @Test
    void constructorTest(){
        CreditCard regular = new CreditCardRegular(1,"Olaf","Schubert");
        assertEquals("Olaf",regular.getName());
        assertEquals("Schubert",regular.getSurname());
        assertTrue(regular instanceof CreditCardRegular);
    }
    /**
     * This test method covers the setLimit method of the CreditCardRegular class.
     *
     * The protected method setLimit will be called in the constructor of the CreditCardRegularClass.
     * It must assign 2000 to the attribute limit.
     *
     * This test method will test, if the set limit method can set the limit field to 2000.
     */
    @Test
    void setLimitTest() {
        CreditCard regular = new CreditCardRegular(1,"Olaf","Schubert");
        assertEquals(2000,regular.getLimit());
    }

}
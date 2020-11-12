import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test Class contains test methods covering the method of the CreditCardGold Class
 */
class CreditCardGoldTest {
    @Test
    /**
     * This method covers the constructor of the CreditCardGold Class.
     *
     * It test if the arguments passed to the constructor are stored as attributes of the instance
     * and can be retrieved by getters.
     */
    void constructorTest(){
        CreditCard gold = new CreditCardGold(1,"Olaf","Schubert");
        assertEquals("Olaf",gold.getName());
        assertEquals("Schubert",gold.getSurname());
        assertTrue(gold instanceof CreditCardGold);
    }

    /**
     * This test method covers the setLimit method of the CreditCardGold class.
     *
     * The protected method setLimit will be called in the constructor of the CreditCardGoldClass.
     * It must assign 5000 to the attribute limit.
     *
     * This test method will test, if the set limit method can set the limit field to 5000.
     */
    @Test
    void setLimitTest() {
        CreditCard gold = new CreditCardGold(1,"Olaf","Schubert");
        assertEquals(5000,gold.getLimit());
    }


}
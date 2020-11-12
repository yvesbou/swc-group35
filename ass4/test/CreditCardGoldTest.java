import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardGoldTest {
    @Test
    void creditCardGoldTest(){
        CreditCard gold = new CreditCardGold(1,"Olaf","Schubert");
        assertEquals("Olaf",gold.getName());
        assertEquals("Schubert",gold.getSurname());
        assertTrue(gold instanceof CreditCardGold);
    }
    @Test
    void setLimitTest() {
        CreditCard gold = new CreditCardGold(1,"Olaf","Schubert");
        assertEquals(5000,gold.getLimit());
    }


}
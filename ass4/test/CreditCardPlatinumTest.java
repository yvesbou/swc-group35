import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPlatinumTest {
    @Test
    void creditCardPlatinumTest(){
        CreditCard platinum = new CreditCardPlatinum(1,"Olaf","Schubert");
        assertEquals("Olaf",platinum.getName());
        assertEquals("Schubert",platinum.getSurname());
        assertTrue(platinum instanceof CreditCardPlatinum);
    }
    @Test
    void setLimitTest() {
        CreditCard platinum = new CreditCardPlatinum(1,"Olaf","Schubert");
        assertEquals(10000,platinum.getLimit());
    }
}
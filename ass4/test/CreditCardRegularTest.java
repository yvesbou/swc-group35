import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardRegularTest {
    @Test
    void creditCardRegularTest(){
        CreditCard regular = new CreditCardRegular(1,"Olaf","Schubert");
        assertEquals("Olaf",regular.getName());
        assertEquals("Schubert",regular.getSurname());
        assertTrue(regular instanceof CreditCardRegular);
    }
    @Test
    void setLimitTest() {
        CreditCard regular = new CreditCardRegular(1,"Olaf","Schubert");
        assertEquals(2000,regular.getLimit());
    }

}
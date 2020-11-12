import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void isExpiredTest() {
        //testing if credit card can be expired.
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        assertFalse(customer.getCard().isExpired());
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        assertTrue(customer.getCard().isExpired());
    }

    @Test
    void setSerialNumberTest() {
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        //testing if the card serial number set is not null
        assertNotNull(regularCustomer.getCard().getSerialNumber());
        //testing if two cards can have the same number.
        assertFalse(regularCustomer.getCard().getSerialNumber() == regularCustomer.getCard().getSerialNumber());


    }

    @Test
    void setSecurityNumberTest() {
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        //testing if the card serial number set is not null
        assertNotNull(regularCustomer.getCard().getSecurityNumber());

        //testing if two cards can have the same number.
        assertFalse(regularCustomer.getCard().getSecurityNumber() == regularCustomer.getCard().getSecurityNumber());

        //testing if security number has 3 digits;
        assertTrue(regularCustomer.getCard().getSecurityNumber() >= 100 && regularCustomer.getCard().getSecurityNumber() <= 99);

    }

    @Test
    void setExpirationDateTest() {
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        //check if expiration Date is of type Date
        assertTrue(regularCustomer.getCard().getExpirationDate() instanceof Date);
    }

    @Test
    void getLimitTest() {
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        assertEquals(2000, regularCustomer.getCard().getLimit());
    }


    @Test
    void isExpiredTest2() {
        CreditCard regular = new CreditCardRegular(0,"Olaf","Scholz");
        CreditCard regular2 = new CreditCardRegular(2,"Olaf","Scholz");
        assertTrue(regular.isExpired());
        assertFalse(regular2.isExpired());
    }

    @Test
    void setSerialNumberTest2() {
        CreditCard regular = new CreditCardRegular(2, "Olaf", "Scholz");
        CreditCard regular2 = new CreditCardRegular(2, "Olaf", "Scholz");
        //testing if the card serial number set is not null
        assertNotNull(regular.getSerialNumber());
        //testing if two cards can have the same number.
        assertFalse(regular.getSerialNumber() == regular2.getSerialNumber());


    }

    @Test
    void setSecurityNumberTest2() {
        CreditCard regular = new CreditCardRegular(2, "Olaf", "Scholz");
        CreditCard regular2 = new CreditCardRegular(2, "Olaf", "Scholz");
        //testing if the card serial number set is not null
        assertNotNull(regular.getSecurityNumber());

        //testing if two cards can have the same number.
        assertFalse(regular.getSerialNumber() == regular2.getSerialNumber());

        //testing if security number has 3 digits;
        assertTrue(regular.getSecurityNumber() >= 100 && regular.getSecurityNumber() <= 99);

    }

    @Test
    void setExpirationDateTest2() {
        CreditCard regular = new CreditCardRegular(2, "Olaf", "Scholz");
        //check if expiration Date is of type Date
        assertTrue(regular.getExpirationDate() instanceof Date);
    }

    @Test
    void getLimitTest2() {
        Customer customer = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer = new RegularCustomer(customer, 1);
        Customer customer2 = new Customer("Olaf", "Schulz", 89, 200300);
        StatusCustomer regularCustomer2 = new RegularCustomer(customer, 0);
        assertEquals(2000, regularCustomer.getCard().getLimit());
    }
}


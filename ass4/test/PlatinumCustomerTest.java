import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this is a test class for the platinumCustomer. It covers the methods of the regularCustomer Class
 */
class PlatinumCustomerTest {

    /**
     * This is a Test covers the following methods of the RegularCustomerClass inherited from
     * the SatusCustomer:
     * deposit
     * withdraw
     * payment_wCreditCard
     * payment_wBankTransfer
     * <p>
     * it test if we can make a Series of payments and the savings are correct.
     */
    @Test
    void PlatinumCustomerPaymentsSeriesTest() {
        Customer HanaBühler = new Customer("Hana", "Bühler", 23, 10000);
        PlatinumCustomer Hana = new PlatinumCustomer(HanaBühler, 3);
        Hana.deposit(1000);
        assertEquals(11000, HanaBühler.getSavings());
        Hana.withdraw(1000);
        assertEquals(10000, HanaBühler.getSavings());
        Hana.payment_wCreditCard(Hana.getCard(), 1000);
        assertEquals(9000, HanaBühler.getSavings());
        Hana.payment_wBankTransfer(5000);
        assertEquals(4000, HanaBühler.getSavings());
    }

    /**
     * This test covers the constructor of the RegularCustomer Class
     * <p>
     * Inside the constructor of the RegularCustomer class, an instance of creditCardRegular
     * will be created and passed to the parent class StatusCustomer.
     * <p>
     * This test check, if the instance of RegularCustomer can get the card and it is not null.
     *
     * @param customer
     * @param years
     */
    void ConstructorTest(Customer customer, int years) {
        PlatinumCustomer platinumCustomer = new PlatinumCustomer(customer, years);
        assertNotNull(platinumCustomer.getCard());
    }

    /**
     * this method runs all the tests
     */
    @Test
    void main() {
        Customer customer = new Customer("Hans", "Heiri", 80, 2000);
        ConstructorTest(customer, 3);
    }

}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this is a test class for the regularCustomer. It covers the methods of the regularCustomer Class
 */
class RegularCustomerTest {

    /**
     * This is a Test covers the following methods of the RegularCustomerClass inherited from
     * the SatusCustomer:
     * deposit
     * withdraw
     * payment_wCreditCard
     * payment_wBankTransfer
     *
     * it test if we can make a Series of payments and the savings are correct.
     */
    @Test
    void RegularCustomerPaymentsSeriesTest(){
        Customer HanaBühler = new Customer("Hana", "Bühler",23,10000);
        RegularCustomer Hana = new RegularCustomer(HanaBühler,3);
        Hana.deposit(1000);
        assertEquals(11000,HanaBühler.getSavings());
        Hana.withdraw(1000);
        assertEquals(10000,HanaBühler.getSavings());
        Hana.payment_wCreditCard(Hana.getCard(),1000);
        assertEquals(9000, HanaBühler.getSavings());
        Hana.payment_wBankTransfer(5000);
        assertEquals(4000,HanaBühler.getSavings());
    }

    /**
     * This test covers the constructor of the RegularCustomer Class
     *
     * Inside the constructor of the RegularCustomer class, an instance of creditCardRegular
     * will be created and passed to the parent class StatusCustomer.
     *
     *This test check, if the instance of RegularCustomer can get the card and it is not null.
     * @param customer
     * @param years
     */
    void ConstructorTest(Customer customer,int years){
        StatusCustomer regularCustomer = new RegularCustomer(customer,years);
        assertNotNull(regularCustomer.getCard());
    }

    /**
     * This method runs all the tests.
     */
    @Test
    void main(){
        Customer customer = new Customer("Hans","Heiri",80,2000);
        ConstructorTest(customer,3);
    }
}
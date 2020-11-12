import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class covers all methods of the GoldenCustomer Class.
 */
class GoldenCustomerTest {

    /**
     * This is a Test covers the following methods of the GoldenCustomerClass inherited from
     * the SatusCustomer:
     * deposit
     * withdraw
     * payment_wCreditCard
     * payment_wBankTransfer
     * <p>
     * it test if we can make a Series of payments and the savings are correct.
     */
    @Test
    void GoldenCustomerPaymentsSeriesTest(){
        Customer SarahOggi = new Customer("Sarah", "Oggi",23,10000);
        GoldenCustomer Sarah = new GoldenCustomer(SarahOggi,3);
        Sarah.deposit(1000);
        assertEquals(11000,SarahOggi.getSavings());
        Sarah.withdraw(1000);
        assertEquals(10000,SarahOggi.getSavings());
        Sarah.payment_wCreditCard(Sarah.getCard(),1000);
        assertEquals(9000, SarahOggi.getSavings());
        Sarah.payment_wBankTransfer(5000);
        assertEquals(4000,SarahOggi.getSavings());
    }

    /**
     * This test covers the constructor of the GoldenCustomer Class
     *
     * Inside the constructor of the GoldenCustomer class, an instance of creditCardRegular
     * will be created and passed to the parent class StatusCustomer.
     *
     *This test check, if the instance of GoldenCustomer can get the card and it is not null.
     * @param customer
     * @param years
     */
    void ConstructorTest(Customer customer,int years){
        RegularCustomer regularCustomer = new RegularCustomer(customer,years);
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

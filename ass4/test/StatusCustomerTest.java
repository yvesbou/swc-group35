import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *This is the test class for the StatusCustomer and all it's methods.
 */
class StatusCustomerTest {

    /**
     * This method tests the deposit method of the StatusCustomer class.
     * It tests if the amount added, gets actually added to the savings.
     *
     * The coverage of this method is the deposit test method and the getSavings method.
     *
     * @param amount
     * @return null
     */
    void depositTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(amount);
        assertEquals(amount+2000,NicoZala.getSavings());
    }

    /**
     * When a negative amount is input into the deposit method, the mothod should do nothing and
     * the savings should remain unchanged. It asserts if the savings before and after the deposit
     * of a negative amount remain unchanged.
     *
     * The coverage of this method is the deposit method and the getSavings() method.
     *
     * @param amount
     * @return null
     */
    void depositNegativeAmountTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        float savings = NicoZala.getSavings();
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(amount);
        assertEquals(savings,NicoZala.getSavings());
    }

    /**
     * This test covers the withdraw(float amount) method of the StatusCustomer class
     *
     * It tests, if the withdraw(float amount) method return the correct withdraw value.
     * @param amount
     */
    void withdrawTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        float withdraw = Nico.withdraw(amount);
        assertEquals(amount ,withdraw);
    }

    /**
     * This test covers the withdraw(card,amount) method of the Status Customer method.
     *
     * It tests, if the savings are correct after the withdraw method gets called.
     * @param amount
     */
    void withdrawSavingsTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.withdraw(amount);
        assertEquals(2000-amount ,NicoZala.getSavings());
    }

    /**
     * This test covers the withdraw method of the StatusCustomer class.
     *
     * it tests, it the withdraw method returns 0, if we want to withdraw an amount grreater, than the
     * savings.
     * @param amount
     */
    void withdrawBelowSavingsTest(float amount){
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        float withdraw =  Nico.withdraw(amount);
        assertEquals(0,withdraw);
    }

    /**
     * This test covers the withdraw method of the StatusCustomer class.
     *
     * It tests, if the method returns 0, if the amount passed to the withdraw method is negative.
     * @param amount
     */
    void withdrawNegativeAmountTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        float withdraw = Nico.withdraw(amount);
        assertEquals(0, withdraw);
    }

    /**
     * This test covers the payment_wCreditCard method of the StatusCustomer class.
     *
     * It tests, if after the payment_wCreditCard gets called, the amount is subtracted form the
     * savings attribute of the StatusCustomer class.
     * @param amount
     */
    void payment_wCreditCardTest( float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wCreditCard(NicoZala.getCard(), amount);
        assertEquals(2000-amount,NicoZala.getSavings());
    }

    /**
     * This method covers the payment_wCreditCard method of the StatusCustomer Class.
     *
     * It test if the method returns an error String if we try to invoke payment_wCreditCard
     * with an amout above the current CreditCardLimit.
     * @param amount
     */
    void payment_wCreditCardAboveLimitTest(float amount){
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        String message = Nico.payment_wCreditCard(NicoZala.getCard(), amount);
        assertEquals("You are not allowed to withdraw more than your limit",message);
    }

    /**
     * This test covers the payment_wBankTransfer method of the StatusCustomer class.
     *
     * It test if the argument amount of the payment_wBankTransfer method gets subtracted
     * from the savings of the StatusCustomer Class.
     * @param amount
     */
    void payment_wBankTransferTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wBankTransfer(amount);
        assertEquals(2000-amount,NicoZala.getSavings());
    }


    /**
     * runs all the tests.
     */
    @Test
    void main(){
        depositTest(100);
        depositNegativeAmountTest(-100);
        withdrawTest(200);
        withdrawNegativeAmountTest(-200);
        withdrawBelowSavingsTest(3000);
        withdrawSavingsTest(100);
        payment_wBankTransferTest(300);
        payment_wCreditCardTest( 100);
        payment_wCreditCardAboveLimitTest(1000000);
        assertTrue(true);
    }
}
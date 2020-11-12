import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusCustomerTest {

    /**
     * @param amount
     *
     *This method tests the deposit method of the StatusCustomer class.
     * It test tests if the amount added, gets actually added to the savings.
     */
    void depositTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(amount);
        assertEquals(amount+2000,NicoZala.getSavings());
    }

    void depositNegativeAmountTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(amount);
        assertEquals(amount+2000,NicoZala.getSavings());
    }

    void withdrawTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.withdraw(amount);
        assertEquals(2000-amount,NicoZala.getSavings());


    }


    void payment_wCreditCardTest(CreditCard card, float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wCreditCard(card, amount);
        assertEquals(2000-amount,NicoZala.getSavings());
    }


    void payment_wBankTransferTest(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wBankTransfer(amount);
        assertEquals(2000-amount,NicoZala.getSavings());
    }

    @Test
    void main(){
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        CreditCard card = Nico.getCard();
        depositTest(100);
        withdrawTest(200);
        payment_wBankTransferTest(300);
        payment_wCreditCardTest(card, 100);
        assertTrue(true);
    }
}
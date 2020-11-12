import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusCustomerTest {

    @Test
    void deposit(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(amount);
        assertEquals(amount+2000,NicoZala.getSavings());
    }

    @Test
    void withdraw(float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.withdraw(amount);
        assertEquals(2000-amount,NicoZala.getSavings());


    }

    @Test
    void payment_wCreditCard(CreditCard card, float amount) {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wCreditCard(card, amount);
        assertEquals(2000-amount,NicoZala.getSavings());
    }

    @Test
    void payment_wBankTransfer(float amount) {
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
        deposit(100);
        withdraw(200);
        payment_wBankTransfer(300);
        payment_wCreditCard(card, 100);
        assertTrue(true);
    }
}
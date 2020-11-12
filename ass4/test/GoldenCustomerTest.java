import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldenCustomerTest {

    @Test
    void GoldCustomer(){
        Customer SarahOggi = new Customer("Sarah", "Oggi",23,10000);
        GoldenCustomer Sarah = new GoldenCustomer(SarahOggi,3);
        Sarah.deposit(1000);
        assertEquals(11000,SarahOggi.getSavings());
        Sarah.withdraw(1000);
        assertEquals(10000,SarahOggi.getSavings());
        Sarah.payment_wCreditCard(Sarah.getCard(),1000);
        assertEquals(9000, SarahOggi.getSavings());
        Sarah.payment_wBankTransfer(5000);
        assertEquals(4000,SarahOggi.getSavings());}

    @Test
    void main(){
        GoldCustomer();
        assertTrue(true);
    }
}
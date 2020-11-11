import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusCustomerTest {

    @Test
    void deposit() {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.deposit(1000);
        assertEquals(3000,NicoZala.getSavings());
    }

    @Test
    void withdraw() {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.withdraw(2000);
        assertEquals(0,NicoZala.getSavings());


    }

    @Test
    void payment_wCreditCard() {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wCreditCard(Nico.getCard(), 2000);
        assertEquals(0,NicoZala.getSavings());
    }

    @Test
    void payment_wBankTransfer() {
        Customer NicoZala = new Customer("Nico","Zala",22,2000);
        StatusCustomer Nico = new GoldenCustomer(NicoZala,3);
        Nico.payment_wBankTransfer(2000);
        assertEquals(0,NicoZala.getSavings());
    }

    @Test
    void main(){
        deposit();
        withdraw();
        payment_wBankTransfer();
        payment_wBankTransfer();
    }
}
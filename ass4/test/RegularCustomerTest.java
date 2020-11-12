import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularCustomerTest {

    @Test
    void RegularCustomer(){
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

}
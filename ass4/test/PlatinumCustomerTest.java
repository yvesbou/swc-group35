import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatinumCustomerTest {
    @Test
    void PlatinumCustomer(){
        Customer ShiChiLiu = new Customer("ShiChi", "Liu",23,10000);
        GoldenCustomer ShiChi = new GoldenCustomer(ShiChiLiu,3);
        ShiChi.deposit(1000);
        assertEquals(11000,ShiChiLiu.getSavings());
        ShiChi.withdraw(1000);
        assertEquals(10000,ShiChiLiu.getSavings());
        ShiChi.payment_wCreditCard(ShiChi.getCard(),1000);
        assertEquals(9000, ShiChiLiu.getSavings());
        ShiChi.payment_wBankTransfer(5000);
        assertEquals(4000,ShiChiLiu.getSavings());}

    @Test
    void main(){
        PlatinumCustomer();
    }
}


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionChiefTest {

    @BeforeAll
    void setup(){
        Customer c1 = new Customer("Hans", "Ueli", 69,30000);

        Customer c3 = new Customer("Hector", "Ramirez", 22,900);

        Customer c5 = new Customer("Chenxi", "Wu", 30, 5000);
        StatusCustomer b1 = new RegularCustomer(c1,5);

        StatusCustomer b3 = new GoldenCustomer(c3,2);

        StatusCustomer b5 = new PlatinumCustomer(c5, 6);

        RegularEmployee Vincent = new RegularEmployee("Vincent", "Müller");

        MainChief Philipp = new MainChief("Philipp", "Fuchs");
    }


    @Test
    void upgradeGoldToPlatinum() {
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new GoldenCustomer(c2,3);
        SectionChief Yves = new SectionChief("Yves", "Boutellier");

        assertEquals("Successfully upgraded",Yves.upgradeGoldToPlatinum(c2.getCustomerID(),5));

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);

        assertEquals("You don't have the permission to do this action",Yves.upgradeGoldToPlatinum(c4.getCustomerID(),3));

    }

    @Test
    void downgradeGoldToRegular(int customerID, int y) {

    }

    @Test
    void main(){
        setup();
        upgradeGoldToPlatinum();
        downgradeGoldToRegular();
        assertTrue(true);
    }
}
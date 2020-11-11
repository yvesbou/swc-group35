import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionChiefTest {

    @BeforeAll
    void setup(){
        Customer c1 = new Customer("Hans", "Ueli", 69,30000);
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        Customer c3 = new Customer("Hector", "Ramirez", 22,900);
        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        Customer c5 = new Customer("Chenxi", "Wu", 30, 5000);
        BaseCustomer b1 = new RegularCustomer(c1,5);
        BaseCustomer b2 = new GoldenCustomer(c2,3);
        BaseCustomer b3 = new GoldenCustomer(c3,2);
        BaseCustomer b4 = new RegularCustomer(c4,4);
        BaseCustomer b5 = new PlatinumCustomer(c5, 6);

        RegularEmployee Vincent = new RegularEmployee("Vincent", "Müller");
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        MainChief Philipp = new MainChief("Philipp", "Fuchs");
    }


    @Test
    void upgradeGoldToPlatinum(int customerID, int y) {

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
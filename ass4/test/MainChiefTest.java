import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainChiefTest {

    @Test
    void downgradePlatinumToGold() {
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new PlatinumCustomer(c2,3);
        MainChief Yves = new MainChief("Yves", "Boutellier");

        assertEquals("Successfully downgraded from Platinum to Gold",Yves.downgradePlatinumToGold(c2.getCustomerID(),5));

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);

        assertEquals("Without a Platinum Card this action is invalid",Yves.downgradePlatinumToGold(c4.getCustomerID(),3));

        assertEquals("No costumer with this ID found",Yves.downgradePlatinumToGold(23,3));

    }

    @Test
    void downgradePlatinumToRegular() {
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new PlatinumCustomer(c2,3);
        MainChief Yves = new MainChief("Yves", "Boutellier");

        assertEquals("Successfully downgraded from Platinum to Regular",Yves.downgradePlatinumToRegular(c2.getCustomerID(),5));

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);

        assertEquals("Without a Platinum Card this action is invalid",Yves.downgradePlatinumToRegular(c4.getCustomerID(),3));

        assertEquals("No costumer with this ID found",Yves.downgradePlatinumToRegular(23,3));

    }

    @Test
    void main(){
        downgradePlatinumToGold();
        downgradePlatinumToRegular();
    }
}
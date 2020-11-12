import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionChiefTest {

    @Test
    void constructorTest(String name, String surname){
        SectionChief sectionChief = new SectionChief(name, surname);
        assertEquals(name, sectionChief.getName());
        assertEquals(surname,sectionChief.getSurname());
    }

    @Test
    void setCityTest(String city) {
        SectionChief sectionChief = new SectionChief("Club", "Mate");
        SectionChief sectionChief2 = new SectionChief("Coca", "Cola");
        assertEquals("The section chief is responsible for " + city.toString(), sectionChief.setCity(city));
        assertEquals("This city is already taken",sectionChief2.setCity(city));
    }

    @Test
    void upgradeGoldToPlatinum() {
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new GoldenCustomer(c2,3);
        SectionChief Yves = new SectionChief("Yves", "Boutellier");

        assertEquals("Successfully upgraded from Gold to Platinum",Yves.upgradeGoldToPlatinum(c2.getCustomerID(),5));

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);

        assertEquals("Without a Gold Credit Card this action is invalid",Yves.upgradeGoldToPlatinum(c4.getCustomerID(),3));

        assertEquals("No costumer with this ID found",Yves.upgradeGoldToPlatinum(23,3));
    }

    @Test
    void downgradeGoldToRegular() {
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new GoldenCustomer(c2,3);
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        SectionChief Vincente = new SectionChief("Vincente", "DelMuller");
        SectionChief R2D2 = new SectionChief("R2", "D2");

        assertEquals("Succesfully downgraded from Gold to Regular", Yves.downgradeGoldToRegular(c2.getCustomerID(),3));

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);
        assertEquals("Without a Gold Credit Card this action is invalid", Yves.downgradeGoldToRegular(c2.getCustomerID(),3));

        assertEquals("No costumer with this ID found",Yves.downgradeGoldToRegular(21,4));
    }

    @Test
    void main(){
        upgradeGoldToPlatinum();
        downgradeGoldToRegular();
        assertTrue(true);
    }
}
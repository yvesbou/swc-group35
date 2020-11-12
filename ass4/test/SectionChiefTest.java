import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class covers the methods of the SectionChief class
 */
class SectionChiefTest {

    /**
     * This method covers the constructor of the SectionChief Class
     *
     * It test if all the constructor arguments are correctly set as attributes inside
     * the instance of the Section chief Class.
     * @param name
     * @param surname
     */
    void constructorTest(String name, String surname){
        SectionChief sectionChief = new SectionChief(name, surname);
        assertEquals(name, sectionChief.getName());
        assertEquals(surname,sectionChief.getSurname());
    }

    /**
     * This test method covers the setCity method of the SectionChief Class.
     *
     * This method tests, if a confirmation String is returned, when a Section chief is assigned to
     * a new city.
     *
     * @param city
     */
    void setCityTest(String city) {
        SectionChief sectionChief = new SectionChief("Coca", "Cola");
        assertEquals("The section chief is responsible for " + city.toString(), sectionChief.setCity(city));
    }

    /**
     * This test covers the setCity method of the SectionChief Class.
     *
     * The method tests, if the method setCity return an error String if the same city
     * will get set twice for different SectionChief instances.
     * @param city
     */
    void setSameCityTwiceTest(String city){
        SectionChief sectionChief = new SectionChief("Club", "Mate");
        SectionChief sectionChief2 = new SectionChief("Coca", "Cola");
        assertEquals("This city is already taken",sectionChief2.setCity(city));
    }

    /**
     *This function covers the downgradeGoldToRegular(int customerID) function in the SectionChief Class
     *
     * It test if the downgrade of a customer is sucessfull by asserting the return String of the function
     *
     * @param ID
     * @param c2
     */
    void downgradeGoldToRegularTest(int ID,Customer c2) {
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("Successfully downgraded from Gold to Platinum",Yves.upgradeGoldToPlatinum(ID,5));
    }

    /**
     * This test method covers the downgradeGoldToPlatinum method of The SectionChief Class.
     *
     * It tests, if the method fails to upgrade a customer return an error String, if the input ID is an non existing CustomerID.
     * @param ID
     * @param c2
     */
    void downgradeGoldToRegularNonValidIDTest(int ID,Customer c2){
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("No costumer with this ID found",Yves.downgradeGoldToRegular(ID,3));
    }

    /**
     * This test covers the downgradeGoldToRegular method of the SectionChief Class.
     *
     * It tests, if the method downgradeGoldToRegular return an error String if the input
     * is not a Golden Customer.
     * @param ID
     * @param c2
     */
    void downgradeGoldToRegularRegularsInputTest(int ID,Customer c2){
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("Without a Gold Credit Card this action is invalid",Yves.downgradeGoldToRegular(ID,3));
    }

    /**
     *This function covers the upgradeGoldToPlatinum(int customerID) function in the SectionChief Class
     *
     * It test if the upgrade of a customer is sucessfull by asserting the return String of the function
     *
     * @param ID
     * @param c2
     */
    void upgradeGoldToPlatinumTest(int ID,Customer c2) {
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("Successfully downgraded from Gold to Regular",Yves.upgradeGoldToPlatinum(ID,5));
    }

    /**
     * This test method covers the upgradeGoldToPlatinum method of The SectionChief Class.
     *
     * It tests, if the method fails to upgrade a customer return an error String, if the input ID is an non existing CustomerID.
     * @param ID
     * @param c2
     */
    void upgradeGoldToPlatinumNonValidIDTest(int ID,Customer c2){
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("No costumer with this ID found",Yves.upgradeGoldToPlatinum(ID,3));
    }

    /**
     * This test covers the upgradeGoldToPlatinum method of the SectionChief Class.
     *
     * It tests, if the method upgradeGoldToPlatinum return an error String, if
     * the input is not a Golden customer.
     * @param ID
     * @param c2
     */
    void upgradeGoldToPlatinumTestRegularAsInputTest(int ID,Customer c2){
        SectionChief Yves = new SectionChief("Yves", "Boutellier");
        Yves.addCustomer(c2);
        assertEquals("Without a Gold Credit Card this action is invalid",Yves.upgradeGoldToPlatinum(ID,3));
    }

    /*
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
     */

    @Test
    void main(){
        constructorTest("Hannes", "Meili");
        setCityTest("Paris");
        setSameCityTwiceTest("Paris");

        Customer c4 = new Customer("Wenjie", "He", 26, 1500);
        StatusCustomer b4 = new RegularCustomer(c4,4);

        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new GoldenCustomer(c2,3);

        upgradeGoldToPlatinumTest(c2.getCustomerID(),c2);
        upgradeGoldToPlatinumTestRegularAsInputTest(c4.getCustomerID(),c4);
        upgradeGoldToPlatinumNonValidIDTest(1000,c2);

        downgradeGoldToRegularTest(c2.getCustomerID(),c2);
        downgradeGoldToRegularRegularsInputTest(c4.getCustomerID(),c4);
        downgradeGoldToRegularNonValidIDTest(1000,c2);
        
        assertTrue(true);
    }
}
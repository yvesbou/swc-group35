import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class covers the methods of the MainChief Class, not including getters and setters.
 */
class MainChiefTest {
    /**
     * This method covers the constructor of the MainChief Class
     *
     * It test if all the constructor arguments are correctly set as attributes inside
     * the instance of the Section chief Class.
     * @param name
     * @param surname
     */
    void constructorTest(String name, String surname){
        MainChief mainChief = new MainChief(name, surname);
        assertEquals(name, mainChief.getName());
        assertEquals(surname,mainChief.getSurname());
    }
    /**
     * This method covers the method downgradePlatinumToRegular of the MainChief Class
     *
     * It tests, if a platinumCustomer can be downgraded to a Regular Customer.
     *It assert if the returned String indicates the sucess of this method.
     * @param platinumCustomer
     */
    void downgradePlatinumToRegularTest(Customer platinumCustomer) {
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(platinumCustomer);
        assertEquals("Successfully downgraded from Platinum to Regular",Yves.downgradePlatinumToRegular(platinumCustomer.getCustomerID(),5));
    }

    /**
     * This test method covers the method downgradePlatinumToRegular of the MainChief Class.
     *
     * It tests, if the method returns an error String, if we input a regular Customer.
     * @param regularCustomer
     */
    void downgradePlatinumToRegularWithRegularAsInput(Customer regularCustomer){
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(regularCustomer);
        assertEquals("Without a Platinum Card this action is invalid",Yves.downgradePlatinumToRegular(regularCustomer.getCustomerID(),3));
    }

    /**
     * This test method covers the method downgradePlatinumToRegular of the MainChief Class
     *
     * It tests if an error String is returned, if an invalid ID is given to the
     * downgradePlatinumToRegular method.
     *
     * @param regularCustomer
     */
    void downgradePlatinumToRegularWithInvalidID(Customer regularCustomer){
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(regularCustomer);
        assertEquals("No costumer with this ID found",Yves.downgradePlatinumToRegular(1000,3));
    }
    /**
     * This method covers the method downgradePlatinumToGold of the MainChief Class
     *
     * It tests, if a platinumCustomer can be downgraded to a Gold Customer.
     *It assert if the returned String indicates the sucess of this method.
     * @param platinumCustomer
     */
    void downgradePlatinumToGoldTest(Customer platinumCustomer) {
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(platinumCustomer);
        assertEquals("Successfully downgraded from Platinum to Gold",Yves.downgradePlatinumToGold(platinumCustomer.getCustomerID(),5));
    }
    /**
     * This test method covers the method downgradePlatinumToGold method of the MainChief Class.
     *
     * It tests, if the method returns an error String, if we input a regular Customer.
     * @param regularCustomer
     */
    void downgradePlatinumToGoldWithRegularAsInputTest(Customer regularCustomer) {
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(regularCustomer);
        Yves.addCustomer(regularCustomer);
        assertEquals("Without a Platinum Card this action is invalid",Yves.downgradePlatinumToGold(regularCustomer.getCustomerID(),3));
    }
    /**
     * This test method covers the method downgradePlatinumToGold of the MainChief Class
     *
     * It tests if an error String is returned, if an invalid ID is given to the
     * downgradePlatinumToGold method.
     *
     * @param platinumCustomer
     */
    void downgradePlatinumToGoldWithInvalidIDTest(Customer platinumCustomer) {
        MainChief Yves = new MainChief("Yves", "Boutellier");
        Yves.addCustomer(platinumCustomer);
        assertEquals("No costumer with this ID found",Yves.downgradePlatinumToGold(1000,3));
    }

    /**
     * This method runs all the tests.
     */
    @Test
    void main(){
        Customer c2 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b2 = new PlatinumCustomer(c2,3);

        Customer c1 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b1 = new RegularCustomer(c1,3);

        downgradePlatinumToRegularTest(c2);
        downgradePlatinumToRegularWithInvalidID(c2);
        downgradePlatinumToRegularWithRegularAsInput(c1);

        Customer c3 = new Customer("Margherita", "Razzoli", 32,1000);
        StatusCustomer b3 = new PlatinumCustomer(c3,3);
        downgradePlatinumToGoldTest(c3);
        downgradePlatinumToGoldWithInvalidIDTest(c2);
        downgradePlatinumToGoldWithRegularAsInputTest(c1);

    }
}
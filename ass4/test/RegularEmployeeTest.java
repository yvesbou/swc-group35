import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this is a test class for the RegularEmployee class. It covers the methods of the RegularEmployee Class
 */
class RegularEmployeeTest {

    /**
     * This test covers the constructor of the RegularEmployee Class
     *
     * it tests, if the arguments passed to the constructor are set correctly as attributes.
     * @param regularEmployee
     */
    void checkConstructor(RegularEmployee regularEmployee){
        assertEquals("Choenpel",regularEmployee.getName());
        assertEquals("Emjee",regularEmployee.getSurname());
    }

    /**
     * this test method covers the addCustomer method of the RegularEmployee Class and
     * also the getCustomer(customerID) method of this class.
     *
     * this test method tests, if a Customer instance added to the list of customers is the same
     * as the one returnde from the getCustomer(id) method.
     * @param regularEmployee
     * @param customer
     */
    void addCustomerTest(RegularEmployee regularEmployee, Customer customer){
        int id = customer.getCustomerID();
        regularEmployee.addCustomer(customer);
        assertEquals(customer,regularEmployee.getCustomer(id));
    }


    /**
     * This test method covers the upgradeRegularToGold method of the RegularEmployee Class.
     * it test, if the customer gets upgraded correctly, if the input is a regular customer.
     *
     * @param regularCustomer
     * @param regularEmployee
     */
    void upgradeRegularToGoldTest(Customer regularCustomer,RegularEmployee regularEmployee){
        assertEquals("Successfully upgraded from Regular to Gold",regularEmployee.upgradeRegularToGold(regularCustomer.getCustomerID(),5));
    }

    /**
     * This test method covers the upgrade RegularToGold method of the Regular Employee Class
     *
     * it tests, if the method return an error String, if the input is a golden Customer.
     *
     * @param goldenCustomer
     * @param regularEmployee
     */
    void upgradeRegularToGoldWithGoldCustomerInputTest(Customer goldenCustomer,RegularEmployee regularEmployee){
        assertEquals("Without a Regular Credit Card this action is invalid",regularEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID(),3));
    }

    /**
     * this test method covers the upgradeRegularToGold method of the RegularEmployee Class
     *
     * It tests, if the method returns an error String, if the input is an invalid customerID
     * @param goldenCustomer
     * @param regularEmployee
     */
    void upgradeRegularToGoldWithInvalidID(Customer goldenCustomer,RegularEmployee regularEmployee){
        assertEquals("No customer with this ID found",regularEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID()+1000,3));
    }

    /**
     * runs all tests.
     */
    @Test
    void main(){
        // setup
        RegularEmployee Emjee = new RegularEmployee("Choenpel", "Emjee");
        Customer ZoeSchmid = new Customer("Zoe", "Schmid", 20, 1000);
        Customer HaraldSchmidt = new Customer("Harald", "Schmidt", 70,3000000);
        Customer BarackObama = new Customer("Barack", "Obama", 60,10000000);
        RegularCustomer Zoe = new RegularCustomer(ZoeSchmid,3);
        GoldenCustomer Harald = new GoldenCustomer(HaraldSchmidt,4);
        PlatinumCustomer Barack = new PlatinumCustomer(BarackObama,3);

        // tests
        checkConstructor(Emjee);
        addCustomerTest(Emjee,ZoeSchmid);
        upgradeRegularToGoldTest(ZoeSchmid,Emjee);
        upgradeRegularToGoldWithGoldCustomerInputTest(HaraldSchmidt,Emjee);
        upgradeRegularToGoldWithInvalidID(ZoeSchmid,Emjee);
        assertTrue(true);
    }
}
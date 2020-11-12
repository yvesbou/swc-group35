import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the test class for the BankEmployee class and all it's methods.
 */
class BankEmployeeTest {

    /**
     * Tests the getCustomer function which returns a customer object given an ID.
     *
     * The test covers if the getCustomer function is supplied with an existing ID it returns the
     * Customer with this ID.
     *
     * To perform this test the following parameters are needed.
     * @param customer
     * @param bankEmployee
     * The real existing function getCustomer however only needs the ID, we pass in customer and bankemployee
     * to get the ID and to be able to call the method getCustomer
     */
    void getCustomerTest(Customer customer,BankEmployee bankEmployee) {
        int ID = customer.getCustomerID();
        bankEmployee.addCustomer(customer);
        assertEquals(customer, bankEmployee.getCustomer(ID));

    }

    /**
     * Tests the getCustomer function which returns a customer object given an ID.
     *
     * The test covers if the getCustomer function is supplied with an inexisting ID it returns null.
     *
     * To perform this test the following parameter is needed.
     * @param id
     */
    void getCustomerNotExistingIDTest(int id){
        BankEmployee bankEmployee = new RegularEmployee("Robert","Habeck");
        int notExistingID =id;
        assertNull(bankEmployee.getCustomer(notExistingID));
    }


    /**
     * Tests the addCustomer function which adds a customer to the list of customers
     *
     * The test covers if the addCustomer function is supplied with an existing customer,
     * the customer gets added to the list and can be found within the customers list
     *
     * To perform this test the following parameters are needed.
     * @param customer
     * @param bankEmployee
     * However the getCustomer function only needs a customer as input, but bankEmployee
     * is needed to call the addCustomer function.
     */
    void addCustomerTest(Customer customer,BankEmployee bankEmployee) {
        int ID = customer.getCustomerID();
        bankEmployee.addCustomer(customer);
        assertTrue(bankEmployee.getCustomers().contains(customer));
    }


    /**
     * Tests the upgradeRegularToGold function which gives a customer a new status and returns a string
     *
     * The test covers if the upgradeRegularToGold function is supplied with an existing regular customer,
     * the customer gets successfully upgraded and returns the String "Successfully upgraded from Regular to Gold"
     * To perform this test the following parameters are needed.
     * @param regularCustomer
     * @param bankEmployee
     * However the upgradeRegularToGold function only needs CustomerID as input and y which stands for years, but bankEmployee is
     * needed to call the addCustomer function and customer to get an existing ID
     * y takes every possible int
     */
    void upgradeRegularToGoldRegularInputTest(Customer regularCustomer,BankEmployee bankEmployee) {
        assertEquals("Successfully upgraded from Regular to Gold", bankEmployee.upgradeRegularToGold(regularCustomer.getCustomerID(), 5));
    }

    /**
     * Tests the upgradeRegularToGold function which gives a customer a new status and returns a string
     *
     * The test covers if the upgradeRegularToGold function is supplied with an existing golden customer,
     * the customer does not get upgraded and returns the String "Without a Regular Credit Card this action is invalid"
     * To perform this test the following parameters are needed.
     * @param goldenCustomer
     * @param bankEmployee
     * However the upgradeRegularToGold function only needs CustomerID as input and y, but bankEmployee is
     * needed to call the addCustomer function and customer to get an existing ID
     * y takes every possible int
     */
    void upgradeRegularToGoldGoldenInputTest(Customer goldenCustomer,BankEmployee bankEmployee) {
        assertEquals("Without a Regular Credit Card this action is invalid", bankEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID(), 3));
    }

    /**
     * Tests the upgradeRegularToGold function which gives a customer a new status and returns a string
     *
     * The test covers if the upgradeRegularToGold function is supplied with an existing platinum customer,
     * the customer does not get upgraded and returns the String "Without a Regular Credit Card this action is invalid"
     * To perform this test the following parameters are needed.
     * @param platinumCustomer
     * @param bankEmployee
     * However the upgradeRegularToGold function only needs CustomerID as input and y, but bankEmployee is
     * needed to call the addCustomer function and customer to get an existing ID
     * y takes every possible int
     */
    void upgradeRegularToGoldPlatinumInputTest(Customer platinumCustomer,BankEmployee bankEmployee) {
        assertEquals("Without a Regular Credit Card this action is invalid", bankEmployee.upgradeRegularToGold(platinumCustomer.getCustomerID(), 3));
    }

    /**
     * Tests the upgradeRegularToGold function which gives a customer a new status and returns a string
     *
     * The test covers if the upgradeRegularToGold function is supplied with not an existing customer,
     * the functions returns the String "No customer with this ID found"
     * To perform this test the following parameters are needed.
     * @param bankEmployee
     * However the upgradeRegularToGold function only needs Customer and y as input, but bankEmployee is
     * needed to call the addCustomer function
     * y takes every possible int
     */
    void upgradeRegularToGoldNonValidInputTest(BankEmployee bankEmployee){
        assertEquals("No customer with this ID found",bankEmployee.upgradeRegularToGold(1000,3));
    }

    @Test
    /**
     * runs all the tests of this class
     */
    void main(){
        //setup
        BankEmployee bankEmployee = new RegularEmployee("Robert","Habeck");

        Customer regularCustomer = new Customer("Tobi","Delbrück",120,2000);
        StatusCustomer b1 = new RegularCustomer(regularCustomer,3);

        Customer goldenCustomer = new Customer("Andi","Hug", 20, 1);
        StatusCustomer b2 = new GoldenCustomer(goldenCustomer,4);

        Customer platinumCustomer = new Customer("Amos","Nostradamus", 30, 200);
        StatusCustomer b3 = new PlatinumCustomer(platinumCustomer,4);

        //tests
        getCustomerTest(regularCustomer,bankEmployee);
        getCustomerNotExistingIDTest(1000);
        addCustomerTest(regularCustomer,bankEmployee);
        getCustomerTest(goldenCustomer,bankEmployee);
        addCustomerTest(goldenCustomer,bankEmployee);
        getCustomerTest(platinumCustomer,bankEmployee);
        addCustomerTest(platinumCustomer,bankEmployee);
        upgradeRegularToGoldRegularInputTest(regularCustomer,bankEmployee);
        upgradeRegularToGoldGoldenInputTest(goldenCustomer,bankEmployee);
        upgradeRegularToGoldPlatinumInputTest(platinumCustomer,bankEmployee);
        upgradeRegularToGoldNonValidInputTest(bankEmployee);


        assertTrue(true);

    }
}
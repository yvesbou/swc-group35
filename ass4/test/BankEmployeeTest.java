import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankEmployeeTest {
    /*
    void setup(){
        //bankEmployee is abstract, therefore no instance can be created.Instead, we create
        //and instance of RegularEmployee and store it in a variable of type
        BankEmployee bankEmployee = new RegularEmployee("Robert","Habeck");
        Customer tobi = new Customer("Tobi","Delbrück",120,2000);
        StatusCustomer b2 = new RegularCustomer(tobi,3);
    }
    */
    @Test
    void getCustomerTest(Customer customer,BankEmployee bankEmployee) {
        //Customer customer = new Customer("Elton","John",67,20000000);
        int ID = customer.getCustomerID();
        bankEmployee.addCustomer(customer);
        assertEquals(customer, bankEmployee.getCustomer(ID));
        int notExistingID = ID +1;
        assertNull(bankEmployee.getCustomer(notExistingID));
    }
    @Test
    void addCustomerTest(Customer customer,BankEmployee bankEmployee) {
        int ID = customer.getCustomerID();
        bankEmployee.addCustomer(customer);
        assertTrue(bankEmployee.getCustomers().contains(customer));
    }

    @Test
    void upgradeRegularToGoldTest(Customer regularCustomer,Customer goldenCustomer,Customer platinumCustomer,BankEmployee bankEmployee) {

        assertEquals("Successfully upgraded from Regular to Gold",bankEmployee.upgradeRegularToGold(regularCustomer.getCustomerID(),5));

        assertEquals("Without a Regular Credit Card this action is invalid",bankEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID(),3));
        assertEquals("Without a Regular Credit Card this action is invalid",bankEmployee.upgradeRegularToGold(platinumCustomer.getCustomerID(),3));

        assertEquals("No costumer with this ID found",bankEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID()+1000,3));

    }

    @Test
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
        getCustomerTest( regularCustomer,bankEmployee);
        addCustomerTest(regularCustomer,bankEmployee);
        upgradeRegularToGoldTest(regularCustomer,goldenCustomer,platinumCustomer,bankEmployee);

            assertTrue(true);

    }
}
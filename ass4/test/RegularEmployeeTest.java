import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularEmployeeTest {


    void checkConstructor(RegularEmployee regularEmployee){
        assertEquals("Choenpel",regularEmployee.getName());
        assertEquals("Emjee",regularEmployee.getSurname());
    }


    void addCustomerTest(RegularEmployee regularEmployee, Customer customer){
        int id = customer.getCustomerID();
        regularEmployee.addCustomer(customer);
        assertEquals(customer,regularEmployee.getCustomer(id));
    }


    void getCustomerTest(RegularEmployee regularEmployee, Customer customer){
        int id = customer.getCustomerID();
        regularEmployee.addCustomer(customer);
        assertEquals(customer,regularEmployee.getCustomer(id));
    }


    void upgradeRegularToGoldTest(Customer regularCustomer,Customer goldenCustomer,Customer platinumCustomer,BankEmployee bankEmployee){
        assertEquals("Successfully upgraded from Regular to Gold",bankEmployee.upgradeRegularToGold(regularCustomer.getCustomerID(),5));

        assertEquals("Without a Regular Credit Card this action is invalid",bankEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID(),3));
        assertEquals("Without a Regular Credit Card this action is invalid",bankEmployee.upgradeRegularToGold(platinumCustomer.getCustomerID(),3));

        assertEquals("No customer with this ID found",bankEmployee.upgradeRegularToGold(goldenCustomer.getCustomerID()+1000,3));

    }

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
        getCustomerTest(Emjee, HaraldSchmidt);
        getCustomerTest(Emjee, BarackObama);
        upgradeRegularToGoldTest(ZoeSchmid,HaraldSchmidt,BarackObama,Emjee);
        assertTrue(true);
    }
}
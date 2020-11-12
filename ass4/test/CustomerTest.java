import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test Class covers all the methods of the Customer class.
 */
class CustomerTest {

    /**
     * This test covers the consturctor of the  Customer class
     *
     * it checks, if the arguments passed to get constructor are set to attributes
     * and can be retrieved by getters.
     * @param name
     * @param surname
     * @param age
     * @param savings
     */
    void constructorTest(String name, String surname, int age, float savings){
        Customer customer = new Customer(name,surname,age,savings);
        assertEquals(name, customer.getName());
        assertEquals(surname, customer.getSurname());
        assertEquals(savings,customer.getSavings());
        assertEquals(age,customer.getAge());
        assertEquals(CustomerSystem.bankAccountNumber,customer.getBankAccountNumber());
        assertEquals(CustomerSystem.customerID, customer.getCustomerID());

    }

    /**
     * This method runs all the tests.
     */
    @Test
    void main(){
        constructorTest("Frazetti", "Looserello", 36,10);
        assertTrue(true);
    }
}
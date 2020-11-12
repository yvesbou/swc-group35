import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {


    void constructorTest(String name, String surname, int age,
                         float savings){
        Customer customer = new Customer(name,surname,age,savings);
        assertEquals(name, customer.getName());
        assertEquals(surname, customer.getSurname());
        assertEquals(savings,customer.getSavings());
        assertEquals(age,customer.getAge());
        assertEquals(CustomerSystem.bankAccountNumber,customer.getBankAccountNumber());
        assertEquals(CustomerSystem.customerID, customer.getCustomerID());

    }

    @Test
    void main(){
        constructorTest("Frazetti", "Looserello", 36,10);
        assertTrue(true);
    }
}
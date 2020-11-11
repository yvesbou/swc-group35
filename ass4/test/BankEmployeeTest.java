import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankEmployeeTest {
    @BeforeAll
    void setup(){
        //bankEmployee is abstract, therefore no instance can be created.Instead, we create
        //and instance of RegularEmployee and store it in a variable of type
        BankEmployee bankEmployee = new RegularEmployee("Robert","Habeck");
        Customer customer = new Customer("Tobi","Delbrück",120,2000);

    }
    @Test
    void addCustomer(Customer customer,BankEmployee bankEmployee) {
        bankEmployee.addCustomer(customer);


    }

    @Test
    void upgradeRegularToGold() {

    }

    @Test
    void main(){

    }
}
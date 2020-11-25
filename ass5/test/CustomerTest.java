import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class contains all test methods for testing the Customer class
 */
class CustomerTest {
    Customer customer;
    Vehicle bus;
    Vehicle microCar;
    Vehicle supercar;
    Vehicle familyCar;
    Date date;

    /**
     * This BeforeAll method sets up all instances needed for the tests.
     */
    @BeforeAll()
    void setup(){
        customer = new Customer();
        microCar = new MicroCar();
        supercar = new Supercar();
        bus = new Bus();
        familyCar = new FamilyCar();
        date = new Date();
    }

    /**
     * This test method covers the ride method of the Customer class.
     *
     * it test if a NullPointerException gets thrown, if one or more inputs to the
     * ride method are null Pointers.
     *
     * @param vehicle this can be a valid instance of Vehicle or
     *               a null pointer for testing the throw of the NullPointerException.
     * @param date this can be a valid instance of Date or
     *            a null pointer for testing the throw of the NullPointerException.
     */
    void rideTestNullPointerInput(Vehicle vehicle, Date date){
        try{
            customer.ride(vehicle, date);
        }
        catch (NullPointerException e){
            return;
        }
        fail("no NullPointerException expected");
    }
    void rideTestCorrectInput(Vehicle vehicle, Date date){
        assertEquals("Bus; as much bags as you want; slow; 5CHF",customer.ride(vehicle, date));
    }

    /**
     * This is the Test method, that runs all the test of this test class.
     */
    @Test
    void main(){
        rideTestNullPointerInput(supercar,null);
        rideTestNullPointerInput(null,date);
        rideTestNullPointerInput(null,null);
        
        rideTestCorrectInput(supercar,date);

    }


}
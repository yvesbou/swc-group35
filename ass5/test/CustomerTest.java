import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class contains test covering the Customer Class.
 * It test tests, if exceptions are thrown correctly but also, if the implementation works.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CustomerTest {
    Customer customer;
    Vehicle bus;
    Vehicle microCar;
    Vehicle supercar;
    Vehicle familyCar;
    IncorrectImplementedVehicle incorrectImplementedVehicle;
    Date date;


    /**
     * This is the IncorrectImplementedVehicle class.
     * It is here to test the NullFieldException.
     * A NullFieldException gets thrown, if a field of a Vehicle is null inside the ride method of
     * the Customer class.
     */
    class IncorrectImplementedVehicle implements Vehicle{
        /**
         *This is the getter for the speed field.
         * @return a null pointer
         */
        private String speed = null;
        private String name = null;
        private String bagsAllowed = null;
        private String price = null;
        public String getSpeed(){
            return speed;
        }
        /**
         *This is the getter for the name field.
         * @return a null pointer
         */
        public String getName(){
            return name;
        }
        /**
         *This is the getter for the bagsAllow field.
         * @return a null pointer
         */
        public String getBagsAllowed(){
            return bagsAllowed;
        }
        /**
         *This is the getter for the price field.
         * @return a null pointer
         */
        public String getPrice(){
            return price;
        }

        /**
         * This is a setter for the speed field
         * @param speed new speed to set
         */
        public void setSpeed(String speed) {
            this.speed = speed;
        }

        /**
         * This is a setter for the name field.
         * @param name the new name to set.
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * This is setter for the bagsAllowed field
         * @param bagsAllowed the new bagsAllowed field.
         */
        public void setBagsAllowed(String bagsAllowed) {
            this.bagsAllowed = bagsAllowed;
        }

        /**
         * This is a setter for the price field.
         * @param price the new price to set
         */
        public void setPrice(String price) {
            this.price = price;
        }
    }
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
        incorrectImplementedVehicle = new IncorrectImplementedVehicle();
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
            fail("nullPointerException should be thrown");
        }
        catch (NullPointerException e){
            assertTrue(true);
        }
        catch (NullFieldException e){
            fail("NullFieldException should not be thrown");
        }
    }

    /**
     * This is the happy path test. If a correct input (not null and correct class)is given to the customer class,
     * then it should print out the correct String.
     *
     * @param vehicle this is an instance of type Vehicle, that is not null.
     * @param date this is an instance of type Date, that is not null.
     */
    void rideTestCorrectInput(Vehicle vehicle, Date date){
        String expected = String.format("%s; %s; %s; %s",vehicle.getName(),vehicle.getBagsAllowed()
                ,vehicle.getSpeed() , vehicle.getPrice());
        try {
            assertEquals(expected, customer.ride(vehicle, date));
        }
        catch (NullPointerException e){
            fail("No NullPointerException should get thrown here.");
        }
        catch (NullFieldException e){
            fail("NullField Exception should not be thrown here.");
        }
    }

    /**
     * This test test if a nullFieldException is thrown, if the getters of the Vehicle argument to the
     * ride method of the customer class returns null in a getter.
     *
     * @param vehicle This is an instance of type Vehicle (no NullPointer). But the getters of the Vehicle are
     *                not implemented correclty and return a NullPointer
     * @param date This is a instance of class Date (not Null)
     */
    void rideTestNullFieldException(Vehicle vehicle,Date date){

        try{
            customer.ride(vehicle,date);
            fail("The ride call should throw a NullFieldException");
        }
        catch(NullFieldException e){
            assertTrue(true);
        }
        catch(NullPointerException e){
            fail("No NullPointerException should be thrown here.");
        }
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
        rideTestCorrectInput(bus,date);
        rideTestCorrectInput(familyCar, date);
        rideTestCorrectInput(microCar, date);

        incorrectImplementedVehicle.setName(null);
        incorrectImplementedVehicle.setBagsAllowed(null);
        incorrectImplementedVehicle.setPrice(null);
        incorrectImplementedVehicle.setSpeed(null);
        rideTestNullFieldException(incorrectImplementedVehicle,date);
        incorrectImplementedVehicle.setName("name");
        incorrectImplementedVehicle.setBagsAllowed("1");
        incorrectImplementedVehicle.setPrice("5 CHF");
        incorrectImplementedVehicle.setSpeed(null);
        rideTestNullFieldException(incorrectImplementedVehicle,date);
        incorrectImplementedVehicle.setName("name");
        incorrectImplementedVehicle.setBagsAllowed("1");
        incorrectImplementedVehicle.setPrice(null);
        incorrectImplementedVehicle.setSpeed("fast");
        rideTestNullFieldException(incorrectImplementedVehicle,date);
        incorrectImplementedVehicle.setName("name");
        incorrectImplementedVehicle.setBagsAllowed(null);
        incorrectImplementedVehicle.setPrice("5 Chf");
        incorrectImplementedVehicle.setSpeed("fast");
        rideTestNullFieldException(incorrectImplementedVehicle,date);
        incorrectImplementedVehicle.setName(null);
        incorrectImplementedVehicle.setBagsAllowed("1");
        incorrectImplementedVehicle.setPrice("5 Chf");
        incorrectImplementedVehicle.setSpeed("fast");
        rideTestNullFieldException(incorrectImplementedVehicle,date);
        incorrectImplementedVehicle.setName(null);
        incorrectImplementedVehicle.setBagsAllowed("1");
        incorrectImplementedVehicle.setPrice(null);
        incorrectImplementedVehicle.setSpeed("fast");
        rideTestNullFieldException(incorrectImplementedVehicle,date);
    }

    /**
     * This method is to clean the state of the test fixture.
     */
    @AfterAll
    void tearDown(){
        customer = null;
        microCar = null;
        supercar = null;
        bus = null;
        familyCar = null;
        date = null;
        incorrectImplementedVehicle=null;
    }


}
import java.util.Date;

/**
 * This is the Customer class.
 * It has the method ride.
 */
public class Customer{
    /**
     *
     * @param vehicle This is the vehicle the customer chooses to take a ride.
     * @param date This argument must be provided but is unused.
     * @return it returns the exact same string, that it also prints.
     * @throws NullPointerException if one or more arguments to the function is a nullPointer.
     */
    public String ride(Vehicle vehicle ,Date date) throws NullPointerException, NullFieldException{
        if (vehicle == null || date ==null){
            throw new NullPointerException();
        }
        if (vehicle.getPrice() ==null || vehicle.getBagsAllowed() ==null ||
        vehicle.getSpeed() ==null || vehicle.getName()==null){
            throw new NullFieldException();
        }
        String s = String.format("%s; %s; %s; %s",vehicle.getName(),vehicle.getBagsAllowed()
                ,vehicle.getSpeed() , vehicle.getPrice());
        System.out.println(s);
        return s;
    }
}

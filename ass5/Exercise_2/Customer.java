import java.util.Date;
public class Customer{
    public void ride(Vehicle vehicle ,Date date) throws NullPointerException{
        if (vehicle == null || date ==null){
            throw new NullPointerException();
        }
        System.out.println(
                String.format("%s; %s; %s; %s",vehicle.getName(),vehicle.getBagsAllowed()
                        ,vehicle.getSpeed() , vehicle.getPrice()));
    }
}

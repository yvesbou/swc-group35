import java.util.Date;
public class Customer{
    public String ride(Vehicle vehicle ,Date date) throws NullPointerException{
        if (vehicle == null || date ==null){
            throw new NullPointerException();
        }
        String s = String.format("%s; %s; %s; %s",vehicle.getName(),vehicle.getBagsAllowed()
                ,vehicle.getSpeed() , vehicle.getPrice());
        System.out.println(s);
        return s;
    }
}

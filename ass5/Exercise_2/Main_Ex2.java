import java.util.Date;

/**
 * This is a test drive for the functionality in this project.
 * It makes a customer and a vehicle and test the ride method.
 */
public class Main_Ex2 {
    /**
     * @param args the default argument to the main function. It is not used here.
     */
    public static void main(String[] args){
        Customer c1 = new Customer();
        Vehicle v1 = new Bus();
        try {
            c1.ride(v1, new Date());
        }
        catch (NullPointerException e) {
            System.out.println(e);
            System.exit(1);
        }
        catch (NullFieldException e){
            System.out.println(e);
            System.exit(1);
        }
    }

}

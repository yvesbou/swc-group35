import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BankEmployee {
    private final String name;
    private final String surname;
    private final int ID;
    private final List<Customer> customers = new ArrayList<Customer>();
    private String city;
    public BankEmployee(String name, String surname,String city) throws Exception {
        if (ChiefOfStaff.isCityTaken(city)){
            throw new Exception("This city is already taken");
        }
        else{
            this.city = city;
            ChiefOfStaff.addCity(city);
        }
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void upgradeRegularToGold(int CustomerID){
        Customer customer;
        Iterator it = customers.iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==ID){
                if (customer.getCard() instanceof CreditCardRegular){
                    //Customer customer,
                    long y = System.currentTimeMillis() +1000;
                    int secNr = CreditCardValidation.getNewSecurityNumber();
                    int serial = CreditCardValidation.getNewSerialNumber();
                    String n = customer.getName();
                    String s = customer.getSurname();
                    BaseCustomer newCustomer = new GoldenCustomer(customer,y,secNr,serial,n,s);
                    customer.setBaseCustomer(newCustomer);
                }
                else{
                    System.out.println("You don't have the permission to do this action");
                }
                break;
            }
        }
        System.out.println("No costumer with this ID found");

    }
    //GETTERS
    public int getID(){
        return ID;
    }
    public List<Customer> getCustomers(){
        return this.customers;
    }

}


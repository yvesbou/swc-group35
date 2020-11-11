import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BankEmployee {
    private final String name;
    private final String surname;
    private final int ID;
    private final List<Customer> customers = new ArrayList<Customer>();
    private String city;
    public BankEmployee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public String upgradeRegularToGold(int CustomerID, int y){
        Customer customer;
        String s;
        Iterator it = customers.iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==ID){
                if (customer.getCard() instanceof CreditCardRegular){
                    //Customer customer,
                    StatusCustomer newCustomer = new GoldenCustomer(customer,y);
                    customer.setBaseCustomer(newCustomer);
                }
                else{
                    s = "You don't have the permission to do this action";
                    System.out.println(s);
                    return s;
                }
                break;
            }
        }
        s = "No costumer with this ID found";
        System.out.println(s);
        return s;

    }
    //GETTERS
    public int getID(){
        return ID;
    }
    public List<Customer> getCustomers(){
        return this.customers;
    }
    public Customer getCustomer(int customerID) throws Exception {
        Customer customer;
        Customer matching = null;
        Iterator it = customers.iterator();
        while(it.hasNext()){
            customer =(Customer)it.next();
            if (customer.getCustomerID()==customerID){
                matching = customer;
            }
        }
        if (matching ==null){
            throw new Exception("customer not found");
        }
        return matching;
    }

}


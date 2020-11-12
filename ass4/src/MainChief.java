import java.util.Iterator;

public class MainChief extends SectionChief{
    public MainChief(String name, String surname){
        super(name, surname);
    }

    public String downgradePlatinumToGold(int customerID, int y){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardPlatinum){
                    StatusCustomer newCustomer = new GoldenCustomer(customer,y);
                    customer.setStatusCustomer(newCustomer);
                    System.out.println("Successfully downgraded from Platinum to Gold");
                    return "Successfully downgraded from Platinum to Gold";
                }
                else{
                    System.out.println("Without a Platinum Card this action is invalid");
                    return "Without a Platinum Card this action is invalid";
                }
            }
        }
        System.out.println("No costumer with this ID found");
        return "No costumer with this ID found";
    }
    public String downgradePlatinumToRegular(int customerID, int y){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardGold){
                    //Customer customer,
                    StatusCustomer newCustomer = new RegularCustomer(customer,y);
                    customer.setStatusCustomer(newCustomer);
                    System.out.println("Successfully downgraded from Platinum to Regular");
                    return "Successfully downgraded from Platinum to Regular";
                }
                else{
                    System.out.println("Without a Platinum Card this action is invalid");
                    return "Without a Platinum Card this action is invalid";
                }
            }
        }
        System.out.println("No costumer with this ID found");
        return "No costumer with this ID found";
    }
}

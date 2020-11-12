import java.util.Iterator;

public class SectionChief extends RegularEmployee{
    private String city;
    public SectionChief(String name, String surname){
        super(name,surname);
    }
    public String setCity(String city) {
        if (ChiefOfStaff.isCityTaken(city)) {
            return "This city is already taken";
        } else {
            this.city = city;
            ChiefOfStaff.addCity(city);
            return "The section chief is responsible for " + city.toString();
        }
    }
    public String upgradeGoldToPlatinum(int customerID, int y){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardGold){
                    StatusCustomer newCustomer = new PlatinumCustomer(customer,y);
                    customer.setBaseCustomer(newCustomer);
                    System.out.println("Successfully upgraded from Gold to Platinum");
                    return "Successfully upgraded from Gold to Platinum";
                }
                else{
                    System.out.println("Without a Gold Credit Card this action is invalid");
                    return "Without a Gold Credit Card this action is invalid";
                }
            }
        }
        System.out.println("No costumer with this ID found");
        return "No costumer with this ID found";
    }


    public String downgradeGoldToRegular(int customerID, int y){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardGold){
                    //Customer customer,
                    StatusCustomer newCustomer = new RegularCustomer(customer,y);
                    customer.setBaseCustomer(newCustomer);
                    System.out.println("Successfully downgraded from Gold to Regular");
                    return "Successfully downgraded from Gold to Regular";
                }
                else{
                    System.out.println("Without a Gold Credit Card this action is invalid");
                    return "Without a Gold Credit Card this action is invalid";
                }
            }
        }
        System.out.println("No costumer with this ID found");
        return "No costumer with this ID found";
    }

}

import java.util.Iterator;

public class SectionChief extends RegularEmployee{
    private String city;
    public SectionChief(String name, String surname){
        super(name,surname);
        city = ChiefOfStaff.getNewCity();
    }
    public void upgradeGoldToPlatinum(int customerID){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardGold){
                    //Customer customer,
                    long y = System.currentTimeMillis()+1000;
                    int secNr = CreditCardValidation.getNewSecurityNumber();
                    int serial = CreditCardValidation.getNewSerialNumber();
                    String n = customer.getName();
                    String s = customer.getSurname();
                    BaseCustomer newCustomer = new PlatinumCustomer(customer,y,secNr,serial,n,s);
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


    public void downgradeGoldToRegular(int customerID){
        Customer customer;
        Iterator it = super.getCustomers().iterator();
        while(it.hasNext()){
            customer = (Customer)it.next();
            if(customer.getCustomerID()==customerID){
                if (customer.getCard() instanceof CreditCardGold){
                    //Customer customer,
                    long y = System.currentTimeMillis()+1000;
                    int secNr = CreditCardValidation.getNewSecurityNumber();
                    int serial = CreditCardValidation.getNewSerialNumber();
                    String n = customer.getName();
                    String s = customer.getSurname();
                    BaseCustomer newCustomer = new RegularCustomer(customer,y,secNr,serial,n,s);
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
}

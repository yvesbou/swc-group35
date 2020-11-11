import java.util.Iterator;

public class SectionChief extends RegularEmployee{
    private String city;
    public SectionChief(String name, String surname,String city){
        super(name,surname,city);
    }
    public String upgradeGoldToPlatinum(int customerID){
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
                    return "You don't have the permission to do this action";
                }
                break;
            }
        }
        return "No costumer with this ID found";
    }
    public void Message_UpgradeGoldToPlatinum(String str){
        System.out.println(str);
    }

    public String downgradeGoldToRegular(int customerID){
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
                    return "You don't have the permission to do this action";
                }
                break;
            }
        }
        return "No costumer with this ID found";
    }
    public void Message_DowngradeGoldToRegular(String str){
        System.out.println(str);
    }
}

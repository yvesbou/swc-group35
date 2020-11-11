package src;

public class RegularCustomer extends BaseCustomer {

    public RegularCustomer(Customer customer,
                           long y, int secNr, int serial, String n, String s){
        super(customer);
        CreditCard card = new CreditCardRegular(y,secNr,serial,n,s);
    }


}

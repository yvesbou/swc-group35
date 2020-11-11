package src;
public class GoldenCustomer extends BaseCustomer {
    public GoldenCustomer(Customer customer,
    long y, int secNr, int serial,String n, String s){
        super(customer);
        CreditCard card = new CreditCardGold(y,secNr,serial,n,s);
        super.setCard(card);
    }
}

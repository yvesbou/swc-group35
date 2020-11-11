public class PlatinumCustomer extends BaseCustomer {
    public PlatinumCustomer(Customer customer,
                            long y, int secNr, int serial, String n, String s){
        super(customer);
        CreditCard card = new CreditCardPlatinum(y,secNr,serial,n,s);
        super.setCard(card);
    }
}

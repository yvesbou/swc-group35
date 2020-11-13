//done

public class PlatinumCustomer extends StatusCustomer {
    public PlatinumCustomer(Customer customer,
                            int y){
        super(customer);
        CreditCard card = new CreditCardPlatinum(y, customer.getName(), customer.getSurname());
        super.setCard(card);
    }
}

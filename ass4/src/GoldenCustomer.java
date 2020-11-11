public class GoldenCustomer extends BaseCustomer {
    public GoldenCustomer(Customer customer,
    int y){
        super(customer);
        CreditCard card = new CreditCardGold(y,customer.getName(), customer.getSurname());
        super.setCard(card);
    }
}

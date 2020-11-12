public class RegularCustomer extends StatusCustomer {

    public RegularCustomer(Customer customer,
                           int y){
        super(customer);
        CreditCard card = new CreditCardRegular(y, customer.getName(), customer.getSurname());
        super.setCard(card);
    }


}

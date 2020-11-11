public class RegularCustomer extends BaseCustomer {

    public RegularCustomer(Customer customer,
                           int y){
        super(customer);
        CreditCard card = new CreditCardRegular(y, customer.getName(), customer.getSurname());
    }


}

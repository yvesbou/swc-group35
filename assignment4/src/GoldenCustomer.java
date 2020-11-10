package src;
public class GoldenCustomer extends BaseCustomer {
    public GoldenCustomer(String name, String surname, int age, int bankAccNr,
                           int customerID, float savings, CreditCard c){
        super(name, surname, age, bankAccNr, customerID, savings, c, "Golden");
    }
}

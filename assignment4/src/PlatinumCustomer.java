package src;
public class PlatinumCustomer extends BaseCustomer {
    public PlatinumCustomer(String name, String surname, int age, int bankAccNr,
                          int customerID, float savings, CreditCard c){
        super(name, surname, age, bankAccNr, customerID, savings, c, "Platinum");
    }
}

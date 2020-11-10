package src;
import java.util.Date;
public class BaseCustomer implements Customer {
    private String Name;
    private String Surname;
    private int Age;
    private final int BankAccountNumber;
    private final int CustomerID;
    private float Savings;
    private CreditCard Card;
    private String CustomerType;

    public BaseCustomer(String name, String surname, int age, int bankAccNr,
                        int customerID, float savings, String customerType){
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
        this.BankAccountNumber = bankAccNr;
        this.CustomerID = customerID;
        this.Savings = savings;
        this.CustomerType = customerType;
    }

    public String getName(){
        return this.Name;
    }
    public String getSurname(){
        return this.Surname;
    }
    public int getAge(){
        return this.Age;
    }
    public int getBankAccountNumber(){
        return this.BankAccountNumber;
    }
    public int getCustomerID(){
        return this.CustomerID;
    }
    public String getCustomerType(){
        return this.CustomerType;
    }
    public float getSavings(){
        return this.Savings;
    }
    public CreditCard getCard(){
        return this.Card;
    }




    public void deposit(int amount){
        Savings += amount;
    };
    public int withdraw(int amount){
        if (amount > Savings){
            return 0;
        }else{
            Savings -= amount;
            return amount;}
    }
    public void payment_wCreditCard(CreditCard card, int amount){
        if (Card.isExpired()){
            System.out.println("The card is expired, please make an appointment with your Customer Consultant");
        }
        else if(Card.getSecurityNumber() != Card.getSecurityNumber()){
            // not really implemented but can be
            System.out.println("The security number was wrong, please try again");
        }
        else{
            int limit = Card.getLimit();
            if (limit < amount){
                System.out.println("You are not allowed to withdraw more than your limit");
            }else{
                Savings -= amount;
            }
        }
    };
    public void payment_wBankTransfer(){};

}

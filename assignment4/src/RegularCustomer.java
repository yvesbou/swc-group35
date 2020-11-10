import java.util.Date;
public class RegularCustomer implements Customer {
    private String Name;
    private String Surname;
    private int Age;
    private int BankAccountNumber;
    private int ID;
    private float Savings;
    private CreditCard card;
    private String CustomerType;

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
        if (card.isExpired()){
            System.out.println("The card is expired, please make an appointment with your Customer Consultant");
        }
        else if(card.getSecurityNumber() != card.getSecurityNumber()){
            // not really implemented but can be
            System.out.println("The security number was wrong, please try again");
        }
        else{
            int limit = card.getLimit();
            if (limit < amount){
                System.out.println("You are not allowed to withdraw more than your limit");
            }else{
                Savings -= amount;
            }
        }
    };
    public void payment_wBankTransfer(){};

}

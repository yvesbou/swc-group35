public class Customer {

    private String name;
    private String surname;
    private int age;
    private final int bankAccountNumber;
    private final int customerID;
    private float savings;
    private StatusCustomer statusCustomer;
    //private CreditCard card;
    //private String customerType;

    public Customer(String name, String surname, int age,
                        float savings){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bankAccountNumber = CustomerSystem.getNewBankAccountNumber();
        this.customerID = CustomerSystem.getNewCustomerID();
        this.savings = savings;
    }
    //GETTERS
    public String getName(){ return this.name; }
    public String getSurname(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
    public int getBankAccountNumber(){
        return this.bankAccountNumber;
    }
    public int getCustomerID(){
        return this.customerID;
    }
    public float getSavings(){
        return this.savings;
    }
    public CreditCard getCard(){return statusCustomer.getCard();}
    //SETTERS
    public void setStatusCustomer(StatusCustomer statusCustomer){
        this.statusCustomer = statusCustomer;
    }
    public void setSavings(float savings){
        this.savings = savings;
    }
}

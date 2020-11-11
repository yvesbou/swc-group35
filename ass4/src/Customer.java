public class Customer {

    private String name;
    private String surname;
    private int age;
    private final int bankAccountNumber;
    private final int customerID;
    private float savings;
    private BaseCustomer baseCustomer;
    //private CreditCard card;
    //private String customerType;

    public Customer(String name, String surname, int age, int bankAccNr,
                        int customerID, float savings, String customerType){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bankAccountNumber = bankAccNr;
        this.customerID = customerID;
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
    public CreditCard getCard(){return baseCustomer.getCard();}
    //SETTERS
    public void setBaseCustomer(BaseCustomer baseCustomer){
        this.baseCustomer = baseCustomer;
    }
    public void setSavings(float savings){
        this.savings = savings;
    }
}

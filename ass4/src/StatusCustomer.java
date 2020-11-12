public abstract class StatusCustomer {

    private CreditCard card;
    private Customer customer;

    protected StatusCustomer(Customer customer){  // protected constructor
        this.customer = customer;
        customer.setBaseCustomer(this);
    }
    //GETTERS
    public CreditCard getCard(){
        return card;
    }
    //SETTERS
    public void setCard(CreditCard card){
        this.card = card;
    }
    public void deposit(float amount){
        float newAmount = customer.getSavings() + amount;
        customer.setSavings(newAmount);
    };
    public float withdraw(float amount){
        if (amount > customer.getSavings()){
            return 0;
        }else{
            float newSavings = customer.getSavings() - amount;
            customer.setSavings(newSavings);
            return amount;}
    }
    public void payment_wCreditCard(CreditCard card, float amount){
        if (this.card.isExpired()){
            System.out.println("The card is expired, please make an appointment with your Customer Consultant");
        }
        else if(this.card.getSecurityNumber() != this.card.getSecurityNumber()){
            // not really implemented but can be
            System.out.println("The security number was wrong, please try again");
        }
        else{
            int limit = this.card.getLimit();
            if (limit < amount){
                System.out.println("You are not allowed to withdraw more than your limit");
            }else{
                float newSavings = customer.getSavings()-amount;
                customer.setSavings(newSavings);
            }
        }
    };
    public void payment_wBankTransfer(float amount){
        if (customer.getSavings()-amount >0){
            float newSavings = customer.getSavings();
            customer.setSavings(newSavings);
        }
        else{
            System.out.println("Your not allowed to go below 0 in your savings while using BankTransfer");
        }

    };

}

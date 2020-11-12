public class CreditCardGold extends CreditCard {
    private int limit;
    public CreditCardGold(int y, String name, String surname){
        super(y, name, surname);
        setLimit();
    }
    protected void setLimit() {
        this.limit = 5000;
    }
    public int getLimit(){ return limit;}
}
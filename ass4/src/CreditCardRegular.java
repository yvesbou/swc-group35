public class CreditCardRegular extends CreditCard {
    private int limit;
    public CreditCardRegular(int y, String name, String surname){
        super(y, name, surname);
        setLimit();
    }
    public void setLimit() {
        this.limit = 2000;
    }
    public int getLimit(){ return limit;}
}

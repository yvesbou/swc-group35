public class CreditCardGold extends CreditCard {
    private int limit;
    public CreditCardGold(long y, int secNr, int Serial, String n, String s){
        super(y, secNr,Serial, n, s);
        setLimit();
    }
    public void setLimit() {
        this.limit = 5000;
    }
    public int getLimit(){ return limit;}
}
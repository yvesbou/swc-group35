public class CreditCardRegular extends CreditCard {
    private int limit;
    public CreditCardRegular(long y, int secNr, int Serial, String n, String s){
        super(y, secNr,Serial, n, s);
    }
    public void setLimit() {
        this.limit = 2000;
    }
    public int getLimit(){ return limit;}
}

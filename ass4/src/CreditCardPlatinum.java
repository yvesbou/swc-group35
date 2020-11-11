public class CreditCardPlatinum extends CreditCard {
    private int limit;
    public CreditCardPlatinum(long y, int secNr, int Serial,String n, String s){
        super(y, secNr,Serial, n, s);
    }
    public void setLimit() {
        this.limit = 10000;
    }

}
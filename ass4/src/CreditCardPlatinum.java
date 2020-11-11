public class CreditCardPlatinum extends CreditCard {
    private int limit;
    public CreditCardPlatinum(int y,String name, String surname){
        super(y, name, surname);
    }
    public void setLimit() {
        this.limit = 10000;
    }
    public int getLimit(){ return limit;}


}
package src;

import java.util.Date;

public class CreditCardPlatinum extends CreditCard {
    /*
    private Date ExpirationDate;
    private int SecurityNumber;
    private int SerialNumber;
    private int Limit;
    private String Level;
    private String Name;
    private String Surname;
    private int years;
     */
    public CreditCardPlatinum(long y, int secNr, int Serial,String n, String s){
        super(y, secNr,Serial,"Platinum", n, s);
    }

}
package src;

import java.util.Calendar;
import java.util.Date;

public class BaseCreditCard implements CreditCard{
    private Date ExpirationDate;
    private int SecurityNumber;
    private int SerialNumber;
    private int Limit;
    private String Level;
    private String Name;
    private String Surname;
    private int years;

    public BaseCreditCard(int y, int secNr, int Serial, String Lvl, String n, String s){
        setExpirationDate(y);
        setSecurityNumber(secNr);
        setSerialNumber(Serial);
        setLevel(Lvl);
        setLimit();
        setName(n);
        setSurname(s);
    }

    // setters //
    public void setName(String n){
        this.Name = n;
    };
    public void setSurname(String s){
        this.Surname = s;
    };
    public void setSerialNumber(int serial){
        this.SerialNumber = serial;
    };
    public void setSecurityNumber(int securityN){
        this.SecurityNumber = securityN;
    };
    public void setExpirationDate(int years){
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.YEAR, years);
        this.ExpirationDate = c.getTime();
    };
    public void setLevel(String lvl){
        this.Level = lvl;
    };
    public void setLimit(){
        switch (getLevel()){
            case "Regular":
                this.Limit = 2000;
                break;
            case "Gold":
                this.Limit = 5000;
                break;
            case "Platinum":
                this.Limit = 10000;
                break;
        }
    };

    // getters //
    public String getName(){
        return this.Name;
    };
    public String getSurname(){
        return this.Surname;
    };
    public int getSerialNumber(){
        return this.SerialNumber;
    };
    public int getSecurityNumber(){
        return this.SecurityNumber;
    };
    public Date getExpirationDate(){
        return this.ExpirationDate;
    };
    public String getLevel(){
        return this.Level;
    };
    public int getLimit(){
        return this.Limit;
    };

    // other methods //
    public Boolean isExpired(){
        long t = ExpirationDate.getTime();
        Date today = new Date(t);
        boolean expired = ExpirationDate.before(today);
        return expired;
    };
}

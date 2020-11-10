package src;
import java.util.Date;
import java.util.Calendar;

public class CreditCardRegular implements CreditCard{
    Date ExpirationDate;
    int SecurityNumber;
    int SerialNumber;
    int Limit;
    String Level;
    String Name;
    String Surname;

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

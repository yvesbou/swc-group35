import java.util.Calendar;
import java.util.Date;

public abstract class CreditCard{
    private Date ExpirationDate;
    private int SecurityNumber;
    private int SerialNumber;

    private String Name;
    private String Surname;
    private int years;

    public CreditCard(long y, int secNr, int Serial, String n, String s){
        setExpirationDate(y);
        setSecurityNumber(secNr);
        setSerialNumber(Serial);
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
    public void setExpirationDate(long y){
        Date currentDate = new Date(y);
        //Calendar c = Calendar.getInstance();
        //c.setTime(currentDate);
        //c.add(Calendar.YEAR, years);
        //this.ExpirationDate = c.getTime();
    };
    public abstract void setLimit();

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
    public abstract int getLimit();

    // other methods //
    public Boolean isExpired(){
        long t = ExpirationDate.getTime();
        Date today = new Date(t);
        boolean expired = ExpirationDate.before(today);
        return expired;
    };
}

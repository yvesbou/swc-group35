import java.util.Calendar;
import java.util.Date;

public abstract class CreditCard{
    private Date ExpirationDate;
    private int SecurityNumber;
    private int SerialNumber;

    private String Name;
    private String Surname;
    private int years;

    public CreditCard(int y, String name, String surname){
        this.years = y;
        setExpirationDate();
        setSecurityNumber();
        setSerialNumber();
        setName(name);
        setSurname(surname);
    }

    // setters //
    public void setName(String n){
        this.Name = n;
    };
    public void setSurname(String s){
        this.Surname = s;
    };
    public void setSerialNumber(){
        this.SerialNumber = CreditCardValidation.getNewSerialNumber();
    };
    public void setSecurityNumber(){
        this.SecurityNumber = CreditCardValidation.getNewSecurityNumber();
    };
    public void setExpirationDate(){
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.YEAR, years);
        this.ExpirationDate = c.getTime();
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
        boolean expired;

        Calendar calndr2 = Calendar.getInstance();
        Date today = calndr2.getTime();

        int exp = ExpirationDate.compareTo(today);
        if (exp > 0){expired = false;}
        else{expired=true;}
        return expired;
    };
}

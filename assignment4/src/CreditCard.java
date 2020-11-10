package src;
import java.util.Date;

public interface CreditCard {
    public void setName(String n);
    public void setSurname(String s);
    public void setSerialNumber(int Serial);
    public void setSecurityNumber(int SecurityN);
    public void setExpirationDate(int years);
    public void setLevel(String lvl);
    public void setLimit();

    public String getName();
    public String getSurname();
    public int getSerialNumber();
    public int getSecurityNumber();
    public Date getExpirationDate();
    public Boolean isExpired();
    public String getLevel();
    public int getLimit();

}

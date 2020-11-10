package src;
import java.util.List;
import java.util.ArrayList;
public class BankEmployee {
    private final String name;
    private final String surname;
    private final int ID;
    private final List<Customer> custumors = new ArrayList<Customer>();
    public BankEmployee(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getChiefOfStaff().getNewID();
    }
    public void upgradeRegularToGold(int CustomerID){}
    public int getID(){
        return ID;
    }

}


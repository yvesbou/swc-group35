package src;
public class Technician {
    private final int ID;
    private final String name;
    private final String surname;
    Technician(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getChiefOfStaff().getNewID();
    }
    public int getID(){
        return ID;
    }

}

public class BackendTechnician implements Technician{
    private final int ID;
    private final String name;
    private final String surname;
    BackendTechnician(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    public void fixBackend(int technicianID){
        System.out.println("fixed!");
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

}

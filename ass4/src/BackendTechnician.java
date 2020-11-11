public class BackendTechnician implements Technician{
    private final int ID;
    private final String name;
    private final String surname;
    BackendTechnician(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    public String fixed(int technicianID){
        return "fixed!";
    }
    public void fixBackend(int technicianID){
        String str = fixed(technicianID);
        System.out.println(str);
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

public class BackendTechnician implements Technician{
    private final int ID;
    private final String name;
    private final String surname;
    BackendTechnician(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    //public String fixed(int technicianID){
       // return "fixed!";
    //}
    public String fixBackend(int technicianID){
        String str = "fixed!";
        System.out.println(str);
        return str;
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

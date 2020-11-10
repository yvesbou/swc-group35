
public class BackendTechnician extends Technician{
    BackendTechnician(String name, String surname) {
        super(name, surname);
    }
    public void fixBackend(int technicianID){
        System.out.println("fixed!");
    }
}

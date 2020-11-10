
public class WebTechnician extends Technician{
    WebTechnician(String name, String surname) {
        super(name, surname);
    }
    public void fixWebsite(){
        try {
            Thread.sleep(30000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("reparations complete");
    }
}

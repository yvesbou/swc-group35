package src;
public class WebTechnician implements Technician{
    private final int ID;
    private final String name;
    private final String surname;
    WebTechnician(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getChiefOfStaff().getNewID();
    }
    public void fixWebsite(){
        try {
            Thread.sleep(30000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("reparations complete");
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

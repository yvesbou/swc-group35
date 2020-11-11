public class WebTechnician implements Technician{
    private final int ID;
    private final String name;
    private final String surname;
    WebTechnician(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = ChiefOfStaff.getNewID();
    }
    public String fix(){
        try {
            Thread.sleep(30000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return "reparations complete";
    }
    public void fixedWebsite(String str){
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

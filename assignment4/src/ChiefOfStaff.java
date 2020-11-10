package src;
public class ChiefOfStaff {
    private static ChiefOfStaff uniqueChiefOfStaff = null;
    private int employeeID = 0;
    private final String[] Cities = {"Paris","Rome","Bern","Riga","Stockholm","Helsinki"};
    private int actualCity = 0;
    private ChiefOfStaff(){};
    public static synchronized ChiefOfStaff getChiefOfStaff() {
        if (uniqueChiefOfStaff == null) {
            uniqueChiefOfStaff  = new ChiefOfStaff(); }
        return uniqueChiefOfStaff;
    }
    public int getNewID(){
        return employeeID++;
    }
    public String getNewCity(){
        String newCity = Cities[actualCity] ;
        ++actualCity;
        return newCity;
    }
}

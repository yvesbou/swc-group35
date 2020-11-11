package src;
public abstract class ChiefOfStaff {
    private static  int employeeID = 0;
    private static final String[] Cities = {"Paris","Rome","Bern","Riga","Stockholm","Helsinki"};
    private static int actualCity = 0;
    public static int getNewID(){
        return employeeID++;
    }
    public static String getNewCity(){
        String newCity = Cities[actualCity] ;
        ++actualCity;
        return newCity;
    }
}

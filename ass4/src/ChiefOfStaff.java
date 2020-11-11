import java.util.Vector;
public abstract class ChiefOfStaff {
    private static int employeeID = 0;
    private static final Vector<String> takenCities = new Vector<String>();
    public static int getNewID(){
        return employeeID++;
    }
    public static boolean isCityTaken(String city){
        return takenCities.contains(city);
    }
    public static void addCity(String city){
        takenCities.add(city);
    }
}

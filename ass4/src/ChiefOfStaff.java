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
    public static String addCity(String city){
        String s;
        if (!isCityTaken(city)) {
            takenCities.add(city);
            s = "Successfully added new City.";
            System.out.println(s);
        }
        else{
            s = "This city is already taken.";
            System.out.println(s);
        }
        return s;
    }
}

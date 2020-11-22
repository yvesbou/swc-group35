import java.util.Iterator;

public class CityOffice extends Office {
    String city;
    String name;

    public CityOffice(String city){
        this.city = city;
        name = "city office of " + city;
    }

    public void printAllBakeriesNames(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.printName(); }
    }

    public void printName(){
        System.out.println(name);
    }
}

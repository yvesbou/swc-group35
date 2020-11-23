import java.util.Iterator;

public class CityOffice extends Office {
    String city;
    String name;

    public CityOffice(String city){
        this.city = city;
        name = "city office of " + city;
    }

    @Override
    public void printAllBakeriesNames(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.print(); }
    }

    @Override
    public void printName(){
        System.out.println(name + ", ");
    }

    @Override
    public void print(){
        
        printName();
        printAllBakeriesNames();
        System.out.println();
    }
}

import java.util.Iterator;

public class CentralOffice extends Office{

    public void printAllOffices(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.printName(); }
    }
}

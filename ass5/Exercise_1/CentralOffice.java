import java.util.Iterator;

public class CentralOffice extends Office{

    @Override
    public void printAllOffices(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.print(); }
    }

    @Override
    public void print(){
        printAllOffices();
    }
}

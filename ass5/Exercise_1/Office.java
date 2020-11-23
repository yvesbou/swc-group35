import java.util.ArrayList;
import java.util.Iterator;

public abstract class Office extends Facility{
    ArrayList facilities = new ArrayList();

    public void add(Facility facility) { facilities.add(facility); }
    public void remove(Facility facility) { facilities.remove(facility); }

    public Iterator createIterator() {
        return new CompositeIterator(facilities.iterator());
    }

    @Override
    public void print(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.print();
        }

    }

}


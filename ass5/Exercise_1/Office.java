import java.util.ArrayList;
import java.util.Iterator;

/**
 * The abstract Office class serves as interface for the actual real types of offices.
 */
public abstract class Office extends Facility{
    ArrayList facilities = new ArrayList();

    /**
     * adds provided facility to the array of managed facilities
     * @param facility: facility that the office should manage
     */
    public void add(Facility facility) { facilities.add(facility); }

    /**
     * removes provided facility from the array of managed facilities
     * @param facility: facility that the office shouldn't manage anymore
     */
    public void remove(Facility facility) { facilities.remove(facility); }

    /**
     * The office should be able to create an iterator of the facilities this office manages
     * @return: a compositeIterator that iterates over the facilities, and if this facility is an office
     * it should create another CompositeIterator
     */
    public Iterator createIterator() {
        return new CompositeIterator(facilities.iterator());
    }

}




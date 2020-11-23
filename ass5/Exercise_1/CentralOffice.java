import java.util.Iterator;

/**
 * The Central office extends the abstract office class and provides a function printAllOffices
 * which is called within print function
 */
public class CentralOffice extends Office{

    /**
     * The printAllOffices iterates through all facilities assigned to the central office, which
     * are city offices and calls the print function of these city offices.
     */
    @Override
    public void printAllOffices(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.print(); }
    }

    /**
     * Since all facilities should implement a print function and actual body of the function
     * is different for bakeries and offices, we call the printName function within the printAllOffices function
     */
    @Override
    public void print(){
        printAllOffices();
    }
}

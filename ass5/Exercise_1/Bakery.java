import java.util.ArrayList;
import java.util.Iterator;

public abstract class Bakery extends Facility{
    String name;
    Address address;

    public void printName() {
        System.out.println(name);
    }

    public Iterator createIterator() {
        return null; }

}

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The abstract bakery class serves as interface for the actual real types of bakeries.
 */
public abstract class Bakery extends Facility{
    String name;
    Address address;

    /**
     * each bakery should implement the printName function
     */
    @Override
    public void printName() {
        System.out.print(name + ", ");
    }

    /**
     * Since all facilities should implement a print function and actual body of the function
     * is different for bakeries and offices, we call the printName function within the print function
     */
    @Override
    public void print(){
        printName();
    }

    /**
     * Each facility should be able to create an iterator, bakeries are equivalent to leafs, so they return null
     * @return null
     */
    public Iterator createIterator() {
        return null;
    }

    /**
     * not implemented yet
     * @param list
     * @return
     */
    public Sandwich SellBreads(ArrayList list){
        throw new UnsupportedOperationException();
    }

    /**
     * not implemented yet
     * @param list
     * @return
     */
    public Cake SellSweets(ArrayList list){
        throw new UnsupportedOperationException();
    }

}

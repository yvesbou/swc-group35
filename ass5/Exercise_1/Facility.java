import java.util.Iterator;

/**
 * Facility is the parent class of the Bakeries as well as the offices.
 * It is abstract and defines the behavior Bakeries as well as offices should implement.
 */
public abstract class Facility {

    /**
     * creates an Iterator of a list of facilities in both office implementations
     * @return Iterator
     */
    public abstract Iterator createIterator();

    /**
     * every facility should implement a print function
     */
    public void print() {
        throw new UnsupportedOperationException();
    }

    /**
     * Bakeries and city offices should implement a printName function
     * if not implemented it should throw an exception
     */
    public void printName() {
        throw new UnsupportedOperationException();
    }

    /**
     * City offices should implement this function,
     * if not implemented it throws an exception
     */
    public void printAllBakeriesNames() {
        throw new UnsupportedOperationException();
    }

    /**
     * the central office should implement this function,
     * for all other it should throw an exception
     */
    public void printAllOffices() {
        throw new UnsupportedOperationException();
    }

    /**
     * normal bakeries and bread-only-bakeries should implement this function,
     * for all other it should throw an exception
     */
    public Sandwich SellBreads(){
        throw new UnsupportedOperationException();
    }

    /**
     * normal bakeries and sweet-only-bakeries should implement this function,
     * for all other it should throw an exception
     */
    public Cake SellSweets(){
        throw new UnsupportedOperationException();
    }

    /**
     * centralOffice and cityOffice should implement this method, to indicate which
     * offices/bakeries belong to the specific office,
     * for bakeries it should throw an exception
     * @param facility: facility that the office should manage
     */
    public void add(Facility facility){
        throw new UnsupportedOperationException();
    };

    /**
     * centralOffice and cityOffice should implement this method, to indicate which
     * offices/bakeries belong to the specific office,
     * this method removes the specific office/bakery that used to belong to the office
     * for bakeries it should throw an exception
     * @param facility: facility that the office shouldn't manage anymore
     */
    public void remove(Facility facility){
        throw new UnsupportedOperationException();
    }
}

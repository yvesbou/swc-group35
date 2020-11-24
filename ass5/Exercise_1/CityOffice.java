import java.util.Iterator;

/**
 * The City office extends the abstract office class and provides a function printAllBakeriesNames
 * which is called within print function
 */
public class CityOffice extends Office {
    String city;
    String name;

    /**
     * Constructor of the City Office
     * @param city: the city that the office is based in and all the bakeries associated with, type String
     */
    public CityOffice(String city){
        this.city = city;
        name = "city office of " + city;
    }

    /**
     * The printAllBakeriesNames iterates through all facilities assigned to the city office, which
     * are bakeries and calls the print function of these bakeries.
     */
    @Override
    public void printAllBakeriesNames(){
        Iterator iterator = facilities.iterator();
        while (iterator.hasNext()) {
            Facility facility = (Facility) iterator.next();
            facility.print(); }
    }

    /**
     * Prints the name of the city office which is called within the print function
     */
    @Override
    public void printName(){
        System.out.println(name + ", ");
    }

    /**
     * Since all facilities should implement a print function and actual body of the function
     * is different for bakeries and offices, we call the printName function within the printAllOffices function
     */
    @Override
    public void print(){

        printName();
        printAllBakeriesNames();
        System.out.println();
    }
}

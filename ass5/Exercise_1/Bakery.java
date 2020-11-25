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
     * This function returns a delicious sandwich with the fillings the consumer wants to have
     * @param aList: list of ingredients the consumer wants in his/her sandwich, type ArrayList
     * @return sandwich the consumer ordered, type Sandwich
     */
    @Override
    public Sandwich SellBreads(ArrayList aList) throws WeSellSweetsOnlyException {
        Sandwich sandwich = new Bread();

        for (Object i:aList){
            switch ((String)i){
                case "Cheese":
                    sandwich = new Cheese(sandwich);
                    break;
                case "Tuna":
                    sandwich = new Tuna(sandwich);
                    break;
                case "Ham":
                    sandwich = new Ham(sandwich);
                    break;
                case "Tomatoes":
                    sandwich = new Tomatoes(sandwich);
                    break;
            }
        }
        return sandwich;
    };

    /**
     * This function returns a delicious cake with the toppings the consumer wants to have
     * @param aList: list of ingredients the consumer wants on this/her cake, type ArrayList
     * @return cake the consumer ordered, type Cake
     */
    public Cake SellSweets(ArrayList aList) throws WeSellBreadOnlyException {
        Cake cake = new RawCake();

        for (Object i:aList){
            switch ((String)i){
                case "Chocolate":
                    cake = new Chocolate(cake);
                    break;
                case "Strawberries":
                    cake = new Strawberries(cake);
                    break;
                case "Cream":
                    cake = new Cream(cake);
                    break;
            }
        }
        return cake;
    }

}

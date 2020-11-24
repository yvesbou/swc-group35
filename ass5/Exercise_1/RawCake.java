/**
 * The RawCake extends the Cake within the decorator design pattern.
 * It serves as basic building block for the decorator design pattern, the different toppings are applied
 * on the RawCake
 */

public class RawCake extends Cake{

    /**
     * Overrides the method cost from the Cake
     * @return the price of the RawCake, type double
     */
    @Override
    public double cost() {
        return 3;
    }
}

/**
 * The bread class extends the sandwich class since a sandwich consists of a bread.
 * It has a cost function.
 */

public class Bread extends Sandwich {

    /**
     * The function should return a price for a bread.
     * @return double
     */
    @Override
    public double cost() {
        return 5;
    }
}

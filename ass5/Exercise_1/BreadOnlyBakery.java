public class BreadOnlyBakery extends Bakery{

    public BreadOnlyBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    @Override
    public Sandwich SellBreads(){
        // don't know how to implement sell yet
        return null;
    };

}

public class SweetsOnlyBakery extends Bakery{
    public SweetsOnlyBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    @Override
    public Cake SellSweets(){
        // don't know how to implement sell yet
        return null;
    }
}

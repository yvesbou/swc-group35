public class NormalBakery extends Bakery {

    public NormalBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    @Override
    public Sandwich SellBreads(){
        // don't know how to implement sell yet
        return null;
    };

    @Override
    public Cake SellSweets(){
        // don't know how to implement sell yet
        return null;
    }
}

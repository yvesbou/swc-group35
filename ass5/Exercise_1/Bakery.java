import java.util.ArrayList;
import java.util.Iterator;

public abstract class Bakery extends Facility{
    String name;
    Address address;

    @Override
    public void printName() {
        System.out.print(name + ", ");
    }

    @Override
    public void print(){
        printName();
    }

    public Iterator createIterator() {
        return null; }

    public Sandwich SellBreads(ArrayList list){
        throw new UnsupportedOperationException();
    }

    public Cake SellSweets(ArrayList list){
        throw new UnsupportedOperationException();
    }

}

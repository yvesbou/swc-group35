import java.util.Iterator;

public abstract class Facility {


    /*public Iterator iterator(){
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }*/

    public abstract Iterator createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void printName() {
        throw new UnsupportedOperationException();
    }

    public void printAllBakeriesNames() {
        throw new UnsupportedOperationException();
    }

    public void printAllOffices() {
        throw new UnsupportedOperationException();
    }

    public Sandwich SellBreads(){
        throw new UnsupportedOperationException();
    }

    public Cake SellSweets(){
        throw new UnsupportedOperationException();
    }

    public void add(Facility facility){
        throw new UnsupportedOperationException();
    };

    public void remove(Facility facility){
        throw new UnsupportedOperationException();
    }
}

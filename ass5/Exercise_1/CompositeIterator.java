import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public Object next(){
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            Facility facility = (Facility) iterator.next();
            if (facility instanceof Office){
                stack.push(facility.createIterator());
            }
            return facility;
        }else{
            return null;
        }
    }

    public boolean hasNext(){
        if (stack.empty()){
            return false;
        } else{
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else{
                return true;
            }
        }
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}

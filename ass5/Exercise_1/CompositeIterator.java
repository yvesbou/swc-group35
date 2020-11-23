import java.util.Iterator;
import java.util.Stack;

/**
 * The CompositeIterator is part of the composite design pattern.
 * It enables to iterate through the company structure in the desired way.
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    /**
     * Constructor
     * @param iterator: Iterator that gets pushed onto the stack
     */
    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    /**
     * next() is function a user defined iterator needs to implement
     * The function enables to loop through the tree like structure.
     * For a leaf it creates no additional iterator,
     * if it's a node it returns a iterator that enables to loop through the nodes/leaves of that node
     * if stack.peek() returns a leaf it returns the leaf (bakery)
     * @return facility if iterator hasNext(), returns null else
     */
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

    /**
     * hasNext() function a user defined iterator has to implement
     * The hasNext() function checks whether the stack of iterators is empty
     * if it's empty it returns false
     * @return if no remaining iterator it returns false, else it pops the next iterator and returns
     */
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

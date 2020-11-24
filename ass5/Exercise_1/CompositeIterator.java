import java.util.Iterator;
import java.util.Stack;

/**
 * The CompositeIterator is part of the composite design pattern.
 * It enables to iterate through the company structure (tree like) in the desired way.
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    /**
     * Constructor
     * @param iterator: Iterator that gets pushed onto the stack, type Iterator
     *                this iterator is created from an ArrayList of facilities
     */
    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    /**
     * first it checks with hasNext(),
     * whether the stack is not empty and there is one iterator left with at least one element left,
     * then it takes the Iterator on the top (without removing it from the stack yet),
     * then the iterator gets the next element which is a facility, if this facility is an office
     * it creates an iterator from the list of facilities belonging to that office, otherwise
     * it returns the facility the iterator is pointing to.
     *
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
     * The hasNext() function checks whether the stack of iterators is empty
     * if it's empty it returns false (1)
     * otherwise it takes the Iterator at the top without removing it yet and checks whether
     * this iterator has at least one element left if not, it removes this iterator from the stack and
     * calls hasNext() (2) recursively to see if there is a next iterator on the stack
     * else it returns true (3)
     * @return (1) false, (2) calling this function recursively, (3) true
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

    /**
     * this user defined iterator does not support remove()
     */
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}

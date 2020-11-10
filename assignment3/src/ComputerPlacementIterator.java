package src;
import java.util.ArrayList;
//belongs to iterator design pattern
public class ComputerPlacementIterator implements iterator {
    ArrayList<Command> placement;
    int position=0;
    ComputerPlacementIterator(ArrayList<Command> placement){
        this.placement = placement;
    }
    public boolean hasNext(){
        boolean hasNextEl = false;
        if (position >= placement.size()||placement.get(position)==null)
            hasNextEl = false;
        else{
            hasNextEl = true;
        }
        return hasNextEl;
    }
    public Object next() {
        Object next = placement.get(position);
        position++;
        return next;
    }
}

package src;
import java.util.ArrayList;

public class ComputerPlacementIterator implements iterator {
    ArrayList<Command> placement;
    int position=0;
    ComputerPlacementIterator(ArrayList<Command> placement){
        this.placement = placement;
    }
    public boolean hasNext(){
        boolean hasNextEl = false;
        if (position+1 >= placement.size()||placement.get(position+1)==null)
            hasNextEl = false;
        else{
            hasNextEl = true;
        }
        return hasNextEl;
    }
    public Object next() {
        position++;
        return placement.get(position);
    }
}

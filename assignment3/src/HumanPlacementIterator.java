package src;
//belongs to iterator design pattern
public class HumanPlacementIterator implements iterator {
    Command[] placement;
    int position=0;
    HumanPlacementIterator(Command[] placement){
        this.placement = placement;
    }
    public boolean hasNext(){
        boolean hasNextEl = false;
        if (position >= placement.length || placement[position] == null)
            hasNextEl = false;
        else{
            hasNextEl = true;
        }
        return hasNextEl;
    }
    public Object next() {
        Object next = placement[position];
        position++;
        return next;
    }
}


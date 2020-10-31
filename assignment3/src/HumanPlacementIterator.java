package src;

public class HumanPlacementIterator implements iterator {
    Command[] placement;
    int position=0;
    HumanPlacementIterator(Command[] placement){
        this.placement = placement;
    }
    public boolean hasNext(){
        boolean hasNextEl = false;
        if (position+1 >= placement.length || placement[position+1] == null)
            hasNextEl = false;
        else{
            hasNextEl = true;
        }
        return hasNextEl;
    }
    public Object next() {
        position++;
        return placement[position];
    }
}


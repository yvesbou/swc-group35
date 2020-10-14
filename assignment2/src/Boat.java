package src;

import java.util.HashMap;
import java.util.Map;

public interface Boat{
    //private Cell cell;
    boolean checkEmpty(Cell cell);
    void markCells(int[] userCommand);
    public boolean checkValidity(int[] userCommand);



}


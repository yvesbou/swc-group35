package src;

import java.util.HashMap;
import java.util.Map;

public interface Boat {
    public void readUserCommand(int[] userCommand);
    public boolean checkEmpty();
    void markCells();
    public boolean checkValidity();



}


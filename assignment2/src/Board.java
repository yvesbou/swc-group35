import java.lang.Exception;
public class Board {
    Spot [][] boxes;

    public Spot getBox(int row, char column)
    {

        if (row < 0 || row > 9 || column not in possible characters) {
            throw new Exception("Index out of bound");
        }

        return boxes[row][column];
    }
}

package src;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Cell {
    private char boat;
    private int row;
    private int column;
    private boolean empty = true;

    /*
    private int rowStart;
    private int rowEnd;
    private char columnStart;
    private char columnEnd; */

    public Cell(int row, int column)
    {

        this.setRow(row);
        this.setColumn(column);
    }

    // SETTERS //
    public void setRow(int row){
        this.row = row;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public void setBoat(char boat){
        this.boat = boat;
    }

    public void setState(boolean empty){
        this.empty = empty;
    }

    // GETTERS //
    public char getBoat()
    {
        return this.boat;
    }

    public boolean getState()
    {
        return this.empty;
    }


    /*
    public int getRowStart()
    {
        return this.rowStart;
    }

    public int getRowEnd()
    {
        return this.rowEnd;
    }

    public void setRow(int rowStart, int rowEnd)
    {
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }

    public char getColumnStart()
    {
        return this.columnStart;
    }

    public char getColumnEnd()
    {
        return this.columnEnd;
    }

    public void setColumn(char columnStart, char columnEnd)
    {
        this.columnStart = columnStart;
        this.columnEnd = columnEnd;
    }

    public int[] rowCoordinates(){
        // start getRowStart, end getRowEnd
        int [] rowCoord = IntStream.range(getRowStart(), getRowEnd()).toArray();
        return rowCoord;
    }

    public ArrayList<Character> columnCoordinates(){

        char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        //char [] columnCoord = new char[0]; // use arraylist instead because Idk length
        ArrayList<Character> columnCoord = new ArrayList<Character>();
        // slice the part of the alphabet
        boolean checker = false;
        for (char c:columns) {
            if (c == getColumnStart()){
                checker = true;
            };
            if (checker){
                columnCoord.add(c);
            }
            if (c == getColumnEnd()){
                checker = false;
            }
        }

        return columnCoord;
    }

     */
}
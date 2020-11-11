public class Cell {
    private char boat = ' ';
    private int row;
    private int column;
    private boolean empty = true;
    private Board board;
    public Cell(int row, int column,Board board)
    {
        this.board= board;
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
    public char getBoatType()
    {
        return boat;
    }

    public boolean isEmpty()
    {
        return this.empty;
    }
    public String getCoordinates(){
        char colName = board.getColNames()[column];
        String coord = Character.toString(colName)+Integer.toString(row);
        return coord;

    }

}
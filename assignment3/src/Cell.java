package src;

public class Cell {
    private char boatType = ' ';
    private Boat boat;
    private int row;
    private int column;
    private boolean empty = true;
    private Board board;
    private boolean gotHit;

    public Cell(int row, int column,Board board) {
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

    public void setBoat(char boatType,Boat boat){
        this.boatType = boatType;
        this.boat = boat;
    }

    public void setState(boolean empty){
        this.empty = empty;
    }

    public void setHit(){
        gotHit=true;
    }
    public boolean getHit(){
        return gotHit;
    }
    // GETTERS //
    public char getBoatType()
    {
        return boatType;
    }
    public Boat getBoat(){ return boat; }

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
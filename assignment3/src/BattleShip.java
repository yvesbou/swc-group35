package src;

public class BattleShip implements Boat{
    private Cell [] cells;
    private int instanceNumber;
    private int len = 4;
    private int startRow;
    private int endRow;
    private int startCol;
    private int endCol;
    private Board board;
    // constructor //
    public BattleShip(int instanceNumber,Board board) {
        this.board=board;
        this.instanceNumber=instanceNumber;
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
    public void markCells(Cell [] cells){
        this.cells = cells;
        for (Cell cell : cells) {
            cell.setBoat('B');
            cell.setState(false);
        }

    }

}
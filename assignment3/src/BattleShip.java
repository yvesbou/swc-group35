package src;

public class BattleShip implements Boat{

    private int len = 4;
    private String BoatType = "Battleship";
    private Cell [] cells;
    private int instanceNumber;
    // constructor //
    public BattleShip(int instanceNumber) {
        this.instanceNumber=instanceNumber;
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
    public void markCells(Cell [] cells){
        this.cells = cells;
        for (Cell cell : cells) {
            cell.setBoat(BoatType.charAt(0));
            cell.setState(false);
        }

    }
    public int getLen(){
        return len;
    }
    public String getBoatType(){
        return BoatType;
    }
}
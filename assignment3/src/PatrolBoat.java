package src;

public class PatrolBoat implements Boat{
    private int len = 2;
    private String BoatType = "PatrolBoat";
    private Cell [] cells;
    private int instanceNumber;
    // constructor //
    public PatrolBoat(int instanceNumber) {
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
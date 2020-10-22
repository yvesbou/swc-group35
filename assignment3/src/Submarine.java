package src;

public class Submarine implements Boat{
    private int len = 3;
    private String BoatType = "Submarine";
    private Cell [] cells;
    private int instanceNumber;
    // constructor //
    public Submarine(int instanceNumber) {
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
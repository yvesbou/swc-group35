package src;

public class Carrier implements Boat{
    private int len = 6;
    private String BoatType = "Carrier";
    private Cell [] cells;
    private int instanceNumber;
    // constructor //
    public Carrier(int instanceNumber) {
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
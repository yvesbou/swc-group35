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
            cell.setBoat(BoatType.charAt(0), this);
            cell.setState(false);
        }

    }
    public int getLen(){
        return len;
    }
    public String getBoatType(){
        return BoatType;
    }
    public boolean isDestroyed(){
        boolean destroyed=true;
        for (Cell cell:cells){
            if (!cell.getHit()){
                destroyed=false;
                break;
            }

        }
        return destroyed;
    }


}
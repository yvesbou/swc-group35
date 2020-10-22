package src;
import java.util.Random;
public class ComputerPlayer implements Player{

    Fleet fleet;
    Board board;

    public void setFleet(Fleet fleet){
        this.fleet = fleet; }
    public void setBoard(Board board){
        this.board = board; }

    public Fleet getFleet(){
        Fleet fleetCopy = new Fleet(fleet);
        return fleetCopy;}

    public Board getBoard(){
        Board boardCopy = new Board(board);
        return boardCopy;}

    //just returns random numbers
    public int[] getShotCommand(){
        int[] shot= new int[2];
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        shot[1] = rand.nextInt(10);
        shot[2] = rand.nextInt(10);
        return shot;
    }

    public int[] getPlacement(String boatType,int instanceNumber){
        int[] placement = new int[2];
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        for (int i=0;i<=3;i++) {
            placement[i] = rand.nextInt(10);
        }
        return placement;
    };

    public void getAttacked(int[] attack){
        int col = attack[0];
        int row = attack[1];
        Cell cell = board.getCell(col, row);
        if (cell.isEmpty()){
            System.out.println("The computer missed");
        }
        else{
            Boat boat = cell.getBoat();
            if (boat.isDestroyed()){
                System.out.println("Your %s was destroyed".format(boat.getBoatType()));}
            System.out.println("Your boat was hit!");

        }
        cell.setHit();
    }
}

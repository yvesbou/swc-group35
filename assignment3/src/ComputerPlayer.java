package src;
import java.util.Random;
public class ComputerPlayer implements Player{
    private String playerType = "ComputerPlayer";
    private Fleet fleet;
    private Board board;

// SETTERS  //
    public void setFleet(Fleet fleet){
        this.fleet = fleet; }
    public void setBoard(Board board){
        this.board = board;
    }
    // GETTERS //
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
        shot[0] = rand.nextInt(10);
        shot[1] = rand.nextInt(10);
        return shot;
    }

    public int[] getPlacement(String boatType,int instanceNumber){
        int[] placement = new int[4];
        Random rand = new Random();
        int direction = rand.nextInt(2);
        int start
        //vertical
        if (direction ==0){

        }
        //horizontal
        else{

        }

        // Generate random integers in range 0 to 999
        for (int i=0;i<=3;i++) {
            placement[i] = rand.nextInt(10);
        }
        return placement;
    };
    public String getPlayerType(){
        return playerType;
    }
    public boolean isAttackable(int[] attack){
        System.out.println("This position was already hit!");
        int col = attack[0];
        int row = attack[1];
        Cell cell = board.getCell(col,row) ;
        boolean attackable  = !cell.getHit();
        return attackable;
    }
    public void getAttacked(int[] attack){
        int col = attack[0];
        int row = attack[1];
        Cell cell = board.getCell(col, row);
        if (cell.isEmpty()){
            System.out.println("Miss");
        }
        else{
            Boat boat = cell.getBoat();
            if (boat.isDestroyed()) {
                System.out.println("You destroyed %s".format(boat.getBoatType()));
            }
            else {
                System.out.println("You hit a boat!");
            }

        }
        cell.setHit();
    }
}

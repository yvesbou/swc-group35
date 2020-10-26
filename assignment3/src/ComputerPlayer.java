package src;
import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

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

    public int[] getPlacement(int boatLen,String boatType,int instanceNumber){
        Random rand = new Random();
        int direction = rand.nextInt(2);
        int colStart, colEnd, rowStart,rowEnd;
        int startCol,startRow,endCol,endRow;
        colEnd = 9;
        rowEnd = 9;
        //vertical placement
        if (direction ==0){
            rowStart = boatLen-1;
            colStart = 0;
        }
        //horizontal placement
        else{
            colStart = boatLen-1;
            rowStart = 0;
        }
        startRow = ThreadLocalRandom.current().nextInt(rowStart,rowEnd+1);
        startCol = ThreadLocalRandom.current().nextInt(colStart,colEnd+1);
        if (direction ==0){
            endCol = startCol;
            endRow = startRow-boatLen+1;

        }
        //horizontal placement
        else{
            endRow = startRow;
            endCol = startCol-boatLen+1;
        }
        // Generate random integers in range 0 to 999
        int[] placement = {startCol,startRow,endCol,endRow};
        return placement;
    };
    public String getPlayerType(){
        return playerType;
    }
    public boolean isAttackable(int[] attack){
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
            cell.setHit();
            System.out.println("Miss");
        }

        else{
            Boat boat = cell.getBoat();
            cell.setHit();
            if (boat.isDestroyed()) {
                System.out.println("you destroyed the enemies boat");
                System.out.print(String.format("You destroyed a %s".format(boat.getBoatType())));
            }
            else {
                System.out.println("You hit a boat!");
            }

        }

    }
}

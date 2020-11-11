import java.util.ArrayList;
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

    public ArrayList<Command> getPlacement(int boatLen, String boatType, int instanceNumber){
        Random rand = new Random();
        ArrayList<Command> placement= new ArrayList<Command>(4);
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
            endCol=startCol;
            endRow=startRow-boatLen+1;
        }
        //horizontal placement
        else{
            endRow= startRow;
            endCol= startCol-boatLen+1;
        }

        Command startColCMD = new Command(startCol,true,true);
        Command startRowCMD = new Command(startRow,false,true);
        Command endColCMD = new Command(endCol,true,false);
        Command endRowCMD = new Command(endRow,false,false);
        placement.add(startColCMD);
        placement.add(startRowCMD);
        placement.add(endColCMD);
        placement.add(endRowCMD);
        /////int[] placement = {startCol,startRow,endCol,endRow};
        //System.out.println(String.format("direction: %s startCol: %s startRow: %s endCol: %s endRow %s",direction,  startCol,startRow,endCol,endRow));

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
    //belongs to itertor design pattern
    public iterator createIterator(int boatLen, String boatType, int instanceNumber){
        ArrayList<Command> placement = getPlacement(boatLen, boatType,instanceNumber);
        return new ComputerPlacementIterator(placement);
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
                System.out.println(String.format("You destroyed a %s",boat.getBoatType()));
            }
            else {
                System.out.println("You hit a boat!");
            }

        }

    }
}

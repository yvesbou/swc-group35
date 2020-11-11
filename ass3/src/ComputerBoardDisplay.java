import java.util.Iterator;
import java.util.Vector;
//this is an observer class
public class ComputerBoardDisplay implements Display {
    private int numCols =10;
    private int numRows = 10;
    //private Board[] boards;
    //private Fleet[] fleets;
    private Vector<Board> boards;
    private Vector<Fleet> fleets;

    public void update(Vector<Board> boards,Vector <Fleet> fleets){
        this.boards = boards;
        this.fleets = fleets;
        printBoard();
    }

    public void printBoard(){
        System.out.println();
        System.out.println("The opponent's board is:");
        System.out.println();
        System.out.print("   |");
        Iterator boardIt = boards.iterator();
        while(boardIt.hasNext()){
            Board board = (Board) boardIt.next();
            if (board.getPlayerType()=="ComputerPlayer"){
                    for (int i = 0; i < numCols; i++) {
                        System.out.print("[" + board.getColNames()[i] + "]");
                    }
                System.out.println();
                System.out.println("---|------------------------------");
                //printing cells
                for (int row = 0; row < numRows; row++) {
                    System.out.print("[" + Integer.toString(row) + "]|");
                    for (int column = 0; column < numCols; column++) {
                        Cell cell = board.getCell(column,row);
                        if (cell.getHit()) {
                            if (cell.isEmpty()){
                                System.out.print("[O]");
                            }
                            else{
                                if (cell.getBoat().isDestroyed()){
                                    System.out.print("[" + cell.getBoatType() + "]");
                                }
                                else {
                                    System.out.print("[X]");
                                }
                            }
                        }
                        else{
                            System.out.print("[ ]");
                        }
                    }
                    System.out.println();
                }
            }
        }
    };
}

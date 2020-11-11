import java.util.Vector;
import java.util.Iterator;
public class HumanBoardDisplay implements Display{
    private int numCols =10;
    private int numRows = 10;
    private Vector<Board> boards;
    private Vector<Fleet> fleets;

    public void update(Vector<Board>boards,Vector<Fleet> fleets){
        this.boards = boards;
        this.fleets = fleets;
        printBoard();
    }

    public void printBoard(){
        System.out.println();
        System.out.println("Your board is:");
        System.out.println();
        System.out.print("   |");
        Iterator boardIt = boards.iterator();
        while(boardIt.hasNext()){
            Board board = (Board) boardIt.next();
            if (board.getPlayerType()=="HumanPlayer"){
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
                                System.out.print("[X]");
                            }
                        }
                        else{
                            System.out.print("[" + cell.getBoatType() + "]");
                        }
                    }
                    System.out.println();
                }
            }
        }
    };
}

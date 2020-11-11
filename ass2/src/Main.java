public class Main {
    /* input has to be given in Form:
           A0 A5
    the first coordinate must always be smaller, than the last coordinate.
    */
    public static void main(String[] args){
        System.out.println("Welcome to Battleship!!");
        Board board = new Board();
        Fleet fleet = new Fleet(board);
        board.printBoard();
    }
}

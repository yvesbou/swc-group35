package src;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Battleship!!");
        Board board = new Board();
        Fleet fleet = new Fleet(board);
        board.printBoard();
    }
}

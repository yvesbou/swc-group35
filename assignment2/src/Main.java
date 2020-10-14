package src;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        Board board = new Board();
        Fleet fleet = new Fleet(board);

        /* Flow:
        -> initialize board and its rules
        -> initialize boatRules
        -> while loop
            -> each boat gets x times initialized
                -> while not true
                    -> ask for placement
                        Board.setCells(
                        -> if valid place break out of outer while loop


         */

    }
}

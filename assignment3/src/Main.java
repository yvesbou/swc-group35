package src;
import java.util.*;


//todo: out of bounds with attack command

public class Main {
    /* input has to be given in Form:
           A0 A5
    the first coordinate must always be smaller, than the last coordinate.
    */
    public static void main(String[] args){
        System.out.println("Welcome to Battleship!!");
        Game game = Game.startGame();
        game.play();
    }
}


// input format teste


/*todo
- iterator design for printing board (mässig since twice the same dateformat)
- class game is a singleton
- game is a subject and the both players are observer and receive game states, your turn/his turn or won/lost

 */
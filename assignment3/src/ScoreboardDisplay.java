package src;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class ScoreboardDisplay implements Display {

    private Vector<Board> boards;
    private Vector<Fleet> fleets;
    private Fleet fleet;

    public void ScoreBoard(){
        Iterator it = fleets.iterator();
        int aliveHuman = 0;
        int destroyedComputer = 0;
        while(it.hasNext()){
            int i;
            fleet = (Fleet) it.next(); //fleet is an array of a playerType with size 10
            for (i = 0; i < fleet.getFleetArray().length; i++) {
                if (fleet.playerType.equals("HumanPlayer")) {
                    if (!fleet.getFleetArray()[i].isDestroyed()) {
                        aliveHuman++;
                    }
                }
                else {
                    if (fleet.getFleetArray()[i].isDestroyed()) {
                        destroyedComputer++;
                    }

                }
            }
        }
        System.out.println();
        System.out.println("Your scoreboard:");
        System.out.println(String.format("   - Player remaining boats: %d",aliveHuman));
        System.out.println(String.format("   - Enemy boats destroyed: %d",destroyedComputer));
    }

    public void update(Vector<Board>boards,Vector<Fleet> fleets){
        this.boards = boards;
        this.fleets = fleets;
        ScoreBoard();
    }



}
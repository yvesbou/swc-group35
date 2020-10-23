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
        int counterHuman = 0;
        int counterComputer = 0;
        while(it.hasNext()){
            int i;

            fleet = (Fleet) it.next(); //fleet is an array of a playerType with size 10
            for (i = 0; i < fleet.fleet.length; i++){
                if (fleet.playerType.equals("HumanPlayer")){
                fleet.fleet[i].isDestroyed();
                counterHuman ++;
                }
                else{
                fleet.fleet[i].isDestroyed();
                counterComputer ++;
            }}
        }
        System.out.println();
        System.out.println("Your scoreboard:");
        System.out.println("   - Player remaining boats: %s".format(Integer.toString(10-counterHuman)));
        System.out.println("   - Enemy boats destroyed: %s".format(Integer.toString(counterComputer)));
    }

    public void update(Vector<Board> boards, Vector<Fleet> fleets){
        this.boards = boards;
        this.fleets = fleets;
        ScoreBoard();
    }



}
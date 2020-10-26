package src;
import java.util.Vector;
import java.util.Iterator;
//Game becomes Singleton, Subject to observers HumanBoardDisplay, ComputerBoardDisplay and ScoreboardDisplay
public class Game {

    // declaring variables //
    private static Game uniqueGame;

    private Vector<Player> players = new Vector<Player>(2);
    private Vector<Board> boards = new Vector<Board>(2);
    private Vector<Fleet> fleets = new Vector<Fleet>(2);
    private Vector<Display> displays = new Vector<Display>(3);

    private Board board;
    private Player humanPlayer;
    private Player computerPlayer;

    // constructor in singleton design //
    private Game(){
        humanPlayer= new HumanPlayer();
        players.add(humanPlayer);
        computerPlayer = new ComputerPlayer();
        players.add(computerPlayer);
    };

    // singleton design getInstance method //
    public static synchronized Game startGame() { if (uniqueGame == null) {
        uniqueGame = new Game(); }
        return uniqueGame;
    }

    // observer design pattern
    public void registerDisplay(Display newDisplay){displays.add(newDisplay);}
    public void removeDisplay(Display newDisplay){displays.remove(newDisplay);}
    public void notifyDisplays(){
        Iterator it = displays.iterator();
        while(it.hasNext()){
            Display display =  (Display) it.next();
            display.update(boards,fleets);
        }
    }

    // following observer design
    public void setupDisplays(){
        registerDisplay(new HumanBoardDisplay());
        registerDisplay((new ComputerBoardDisplay()));
        registerDisplay(new ScoreboardDisplay());
    }

    // initialize boards, fleets for each player
    public void setupBoards(){
        Iterator it = players.iterator();
        while(it.hasNext()) {
            Player player = (Player) it.next();
            Board board = new Board(player);
            Fleet fleet = new Fleet(board,player);
            player.setBoard(board);
            player.setFleet(fleet);
            boards.add(board);
            fleets.add(fleet);
        }
    }

    public boolean checkWinner(){
        boolean winnerExist = false;
        Iterator it = fleets.iterator();
        Fleet fleet;
        int counterHuman = 0;
        int counterComputer = 0;
        while(it.hasNext()){
            int i;

            fleet = (Fleet) it.next(); //fleet is an array of a playerType with size 10
            for (i = 0; i < fleet.getFleetArray().length; i++){
                if (fleet.playerType.equals("HumanPlayer")){
                    if(fleet.getFleetArray()[i].isDestroyed()) {
                        counterHuman++;
                    }
                }
                else{
                    if(fleet.getFleetArray()[i].isDestroyed()) {
                        counterComputer++;
                    }
                }}}
        if (counterHuman == 10 && counterComputer == 10){
            System.out.println("Draw");
        }
        else if(counterHuman == 10){
            System.out.println("Congratulations, you won!");
        }
        else{
            System.out.println("Sorry, you lost!");
        }
        return winnerExist;
    }

    public void play(){
        int[] attack;
        setupBoards();
        setupDisplays();
        notifyDisplays(); //only notify the display elements after a full round
        while(true) {
            // first players attack
            while (true) {
                attack = humanPlayer.getShotCommand();
                if (computerPlayer.isAttackable(attack)) {
                    computerPlayer.getAttacked(attack);

                    break;
                }
            }

            // second players attack
            while (true) {
                attack = computerPlayer.getShotCommand();
                if (humanPlayer.isAttackable(attack)) {
                    humanPlayer.getAttacked(attack);
                    notifyDisplays(); //only notify the display elements after a full round
                    break;
                }
            }
            boolean winnerExists = checkWinner();
            if (winnerExists){
                break;
            }
        }

        // pass attack from one player to the other player check if hit and then pass success back
    }
}
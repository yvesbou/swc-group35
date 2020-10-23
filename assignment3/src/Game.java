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

    // singleton design //
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

    // possibly rename since not in observer design pattern

    public void setupDisplays(){
        displays.add(new HumanBoardDisplay());
        displays.add(new ComputerBoardDisplay());
    }
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
    public void play(){
        int[] attack;
        setupBoards();
        setupDisplays();
        while(true) {
            // first players attack
            while (true) {
                attack = humanPlayer.getShotCommand();
                if (computerPlayer.isAttackable(attack)) {
                    computerPlayer.getAttacked(attack);
                    notifyDisplays();

                    break;
                }
            }

            // second players attack
            while (true) {
                attack = computerPlayer.getShotCommand();
                if (humanPlayer.isAttackable(attack)) {
                    humanPlayer.getAttacked(attack);
                    notifyDisplays();
                    break;
                }
            }
        }

        // pass attack from one player to the other player check if hit and then pass success back
    }
}
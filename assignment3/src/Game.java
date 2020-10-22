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
    private Player player;
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

    // possibly rename since not in observer design pattern


    public void setupBoards(){
        Iterator it = players.iterator();
        while(it.hasNext()) {
            player = (Player) it.next();
            Board board = new Board();
            Fleet fleet = new Fleet(board,player);
            player.getBoard(board);
            player.getFleet(fleet);
            boards.add(board);
            fleets.add(fleet);
        }
    }
    public void play(){
        int[] attack;
        setupBoards();

        while(true){

            // first players attack

            attack = humanPlayer.getShotCommand();
            computerPlayer.getAttacked(attack);

            // second players attack

            attack = computerPlayer.getShotCommand();
            humanPlayer.getAttacked(attack);



        // pass attack from one player to the other player check if hit and then pass success back
    }

}}
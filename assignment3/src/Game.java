package src;
import java.util.Vector;
import java.util.Iterator;
//Game becomes Singleton and Subject for player observers
public class Game {

    private Vector<Player> players = new Vector<Player>(2);
    private Vector<Board> boards = new Vector<Board>(2);
    private Vector<Fleet> fleets = new Vector<Fleet>(2);
    private Player player;

    public void registerPlayer(Player newPlayer){
        players.add(newPlayer);
    }
    public void removePlayer(Player oldPlayer){
        players.remove(oldPlayer);
    }
    public void setupBoards(){
        Iterator it = players.iterator();
        while(it.hasNext()) {
            player = (Player) it.next();
            Board board= new Board();
            boards.add(board);
            fleets.add(new Fleet(board,player));
        }
    }
    public void play(){

    }

}
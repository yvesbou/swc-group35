package src;
import java.util.Random;
public class ComputerPlayer implements Player{
    //just returns random numbers
    public int[] getShotCommand(){
        int[] shot= new int[2];
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        shot[1] = rand.nextInt(10);
        shot[2] = rand.nextInt(10);
        return shot;
    }

    public int[] getPlacement(String boatType,int instanceNumber){
        int[] placement = new int[2];
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        for (int i=0;i<=3;i++) {
            placement[i] = rand.nextInt(10);
        }
        return placement;
    };
}

import java.util.HashMap;
import java.util.Map;

public class Boat{
    BoatTypes boatType;
    int boatLength;
    int maxNumberBoats;
    int numberBoats;

    private void setBoatLength(BoatTypes boatType){
        if (boatType == "CARRIER"){

        }
    }

    /*
    private static
    HashMap<String, Integer> Length = new HashMap<String, Integer>();
    CARRIER, BATTLESHIP, SUBMARINE, PATROLBOAT
    Length.put(this.BoatTypes, 185);
    Length.put("Battle") */

    public Boat(BoatTypes BoatType){
        this.boatType = BoatType;
        setBoatLength();

    }
}


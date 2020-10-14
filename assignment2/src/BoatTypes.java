package src;
import java.io.Serializable;

public enum BoatTypes implements Serializable {
    CARRIER, BATTLESHIP, SUBMARINE, PATROLBOAT;

    public String toString(){
        switch(this){
            case CARRIER :
                return "Carrier";
            case BATTLESHIP :
                return "Battleship";
            case SUBMARINE :
                return "Submarine";
            case PATROLBOAT :
                return "Patrolboat";
        }
        return null;
    }

    /*
    public static BoatTypes valueOf(Class<BoatTypes> enumType, String value){
        if(value.equalsIgnoreCase(CARRIER.toString()))
            return BoatTypes.CARRIER;
        else if(value.equalsIgnoreCase(BATTLESHIP.toString()))
            return BoatTypes.BATTLESHIP;
        else if(value.equalsIgnoreCase(SUBMARINE.toString()))
            return BoatTypes.SUBMARINE;
        else if(value.equalsIgnoreCase(PATROLBOAT.toString()))
            return BoatTypes.PATROLBOAT;
        else
            return null;
    }*/
}

package src;

import java.util.HashMap;
import java.util.Map;



public class Boat{
    BoatTypes boatType;
    int boatLength;
    int maxNumberBoats;
    int numberBoats;


    private void BoatRules(BoatTypes boatType){
        if (boatType.toString() == BoatTypes.CARRIER.toString()){
            boatLength = 6;
            maxNumberBoats = 1;
        }
        else if (boatType.toString() == BoatTypes.BATTLESHIP.toString()){
            boatLength = 4;
            maxNumberBoats = 2;
        }

        else if (boatType.toString() == BoatTypes.SUBMARINE.toString()){
            boatLength = 3;
            maxNumberBoats = 3;
        }
        else{
            boatLength = 2;
            maxNumberBoats = 4;
        }
    }

    public int BoatCounter(BoatTypes boatType){

        if (boatType.toString() == BoatTypes.CARRIER.toString()){
            int boatcount ++;
            maxNumberBoats = 1;
        }
        else if (boatType.toString() == BoatTypes.BATTLESHIP.toString()){
            boatLength = 4;
            maxNumberBoats = 2;
        }

        else if (boatType.toString() == BoatTypes.SUBMARINE.toString()){
            boatLength = 3;
            maxNumberBoats = 3;
        }
        else{
            boatLength = 2;
            maxNumberBoats = 4;
        }

        return 0;
    };



    public Boat(BoatTypes BoatType){
        this.boatType = BoatType;
        BoatRules(boatType);
        BoatCounter(boatType);

    }
}


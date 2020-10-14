package src;

import javax.sound.midi.SysexMessage;

public class Fleet {
    private String[] ships={"Carrier","Battleship","Submarine","PatrolBoat"};
    private int[] numbers={1,2,3,4};
    //private int[] numbers={1,0,0,0};
    private int totalBoats = 10;
    private int counter = 0;
    private Board board;
    Boat[] fleet= new Boat[totalBoats];

    public Fleet(Board board){
        this.board = board;
        createFleet();
    }
    public void createFleet(){
        for ( int i = 0 ; i< numbers.length;i++ ){
            int number = numbers[i];
            String ship = ships[i];
            for (int j = 1; j <= number;j++){
                switch(ship){
                    case "Battleship":
                        fleet[counter] = new BattleShip(board,j);
                        break;
                    case "Submarine":
                        fleet[counter] = new Submarine(board,j);
                        break;
                    case "Carrier":
                        fleet[counter]= new Carrier(board,j);
                        break;
                    case "PatrolBoat":
                        fleet[counter] = new PatrolBoat( board,j);
                        break;
                }
                counter++;

            }
        }
    }
}

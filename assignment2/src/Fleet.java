package src;

public class Fleet extends Board{
    private String[] ships={"Carrier","Battleship","Submarine","PatrolBoat"};
    private int[] numbers={1,2,3,4};
    private int totalBoats = 10;
    private int counter = 0;
    private Board board;
    Boat[] fleet= new Boat[totalBoats];

    public Fleet(Board board){
        this.board =board;
        createFleet();
    }
    private void createFleet(){
        for ( int i = 0 ; i< numbers.length;i++ ){
            int number = numbers[i];
            String ship = ships[i];
            for (int j = 1; j <= number;j++){
                switch(ship){
                    case "Battleship":
                        fleet[counter] = new BattleShip(j,board);
                        break;
                    case "Submarine":
                        fleet[counter] = new Submarine(j,board);
                        break;
                    case "Carrier":
                        fleet[counter]= new Carrier(j,board);
                        break;
                    case "PatrolBoat":
                        fleet[counter] = new PatrolBoat(j,board);
                        break;
                }
                counter++;

            }
        }
    }
}

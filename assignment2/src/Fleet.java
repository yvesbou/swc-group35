package src;

public class Fleet {
    private String[] ships={"Carrier","Battleship","Submarine","PatrolBoat"};
    private int[] numbers={1,2,3,4};
    private int totalBoats = 10;
    private int counter = 0;
    private Board board;
    public Fleet(Board board){
        this.board = board;
        createFleet();
    }
    Boat[] fleet= new Boat[totalBoats];
    public void createFleet(){
        for ( int i = 0 ; i< numbers.length;i++ ){
            int number = numbers[i];
            String ship = ships[i];
            for (int j = 1; j <= number;j++){
                switch(ship){
                    case "Battleship":
                        fleet[counter] = new BattleShip(board,j);
                    case "Submarine":
                        fleet[counter] = new Submarine(board,j);
                    case "Carrier":
                        fleet[counter]=new Carrier(board,j);
                    case "PatrolBoat":
                        fleet[counter] = new PatrolBoat( board,j);
                }
                counter++;

            }
        }
    }
}

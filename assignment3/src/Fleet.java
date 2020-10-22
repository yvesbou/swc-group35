package src;

public class Fleet extends Board{
    private String[] ships={"Carrier","Battleship","Submarine","PatrolBoat"};
    private int[] numbers={1,2,3,4};
    private int totalBoats = 10;
    private int counter = 0;
    private Board board;
    private Player player;
    private int startCol ;
    private int startRow ;
    private int endCol ;
    private int endRow ;

    Boat[] fleet= new Boat[totalBoats];

    public Fleet(Board board,Player player){
        this.board =board;
        this.player = player;
        createFleet();
    }
    public Fleet(Fleet fleet) {

        ships =  fleet.ships;
        numbers = fleet.numbers;
        totalBoats = fleet.totalBoats;
        counter = fleet.counter;
        board  = fleet.board;
        player = fleet.player;
        startCol = fleet.startCol;
        startRow = fleet.startRow;
        endCol = fleet.endCol;
        endRow = fleet.endRow;
    }

    private void createFleet(){
        for ( int i = 0 ; i< numbers.length;i++ ){
            int number = numbers[i];
            String ship = ships[i];
            for (int j = 1; j <= number;j++){
                switch(ship){
                    case "Battleship":
                        fleet[counter] = new BattleShip(j);
                        break;
                    case "Submarine":
                        fleet[counter] = new Submarine(j);
                        break;
                    case "Carrier":
                        fleet[counter]= new Carrier(j);
                        break;
                    case "PatrolBoat":
                        fleet[counter] = new PatrolBoat(j);
                        break;
                }
                placeBoat(fleet[counter]);
                counter++;

            }
        }
    }
    public Cell[] getCells(){
        Cell[] cells = new Cell[endRow -startRow +endCol-startCol];
        if (startCol == endCol){
            cells = board.getCol(startRow,endRow,endCol);
        }
        else {
            cells = board.getRow(startCol,endCol,startRow);
        }
        return cells;
    }
    private void placeBoat(Boat ship){
        boolean userInput = false;
        boolean validity;
        boolean empty;
        while (!userInput) {
            int[] userCommand;
            userCommand = player.getPlacement(ship.getBoatType(), ship.getInstanceNumber());
            readUserCommand(userCommand);
            validity = checkValidity(ship);
            Cell[] cells = getCells();
            if (!validity) {
                continue;
            }
            empty = checkEmpty(cells);
            if (!empty) {
                continue;
            }
            else {
                ship.markCells(cells);
                userInput = true;
                }
            }
        }


    public boolean checkEmpty(Cell[] cells) {
        boolean empty = true;
        for (int i = 0; i < cells.length; i++) {
            Cell cell = cells[i];
            if (!cell.isEmpty()) {
                empty = false;
                System.out.println("The Cell " + cell.getCoordinates() +
                        " is occupied with boatType: " + cell.getBoatType());
            }

        }
        return empty;
    }


    public void readUserCommand(int[] userCommand)  {
        startCol = userCommand[0];
        startRow = userCommand[1];
        endCol = userCommand[2];
        endRow = userCommand[3];
    }

    public boolean checkValidity(Boat ship){

        boolean validity = true;

        if (endRow-startRow+endCol-startCol +1 != ship.getLen()){
            validity = false;
            System.out.println("Wrong Boat length");
        }
        else if ((startRow > 9) || (startRow < 0) || (startCol > 9) || (startCol < 0) || (endRow < 0) || (endRow > 9) || (endCol < 0) || (endCol > 9)){
            validity = false;
            System.out.println("Out of Bounds");
        }
        else if ((startRow != endRow) && (startCol != endCol)){
            System.out.println("Ship must not be placed diagonally");
            validity = false;
        }
        return validity;
    }
}

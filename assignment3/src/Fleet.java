package src;

public class Fleet {
    String playerType;
    private String[] ships={"Carrier","Battleship","Submarine","PatrolBoat"};
    private int[] numbers={1,2,3,4};
    private int totalBoats = 1;
    private int counter = 0;
    private Board board;
    private Player player;
    private int startCol ;
    private int startRow ;
    private int endCol ;
    private int endRow ;
    private Boat[] fleetArray;

    public Fleet(Board board,Player player){
        this.board = board;
        this.player = player;
        this.playerType = player.getPlayerType();
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
        fleetArray = fleet.fleetArray;
    }
    public Boat[] getFleetArray(){
        return fleetArray.clone();
    }
    private void createFleet(){
        totalBoats = 0;
        for (int i:numbers){
            totalBoats+=i;
        }
        fleetArray = new Boat[totalBoats];
        for ( int i = 0 ; i< numbers.length;i++ ){
            int number = numbers[i];
            String ship = ships[i];
            for (int j = 1; j <= number;j++){
                switch(ship){
                    case "Battleship":
                        fleetArray[counter] = new BattleShip(j);
                        break;
                    case "Submarine":
                        fleetArray[counter] = new Submarine(j);
                        break;
                    case "Carrier":
                        fleetArray[counter]= new Carrier(j);
                        break;
                    case "PatrolBoat":
                        fleetArray[counter] = new PatrolBoat(j);
                        break;
                }
                placeBoat(fleetArray[counter]);
                counter++;
            }
        }
    }
    public int getTotalBoats(){
        return totalBoats;
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
        iterator userCommand;
        while (!userInput) {
            userCommand = player.createIterator(ship.getLen(), ship.getBoatType(), ship.getInstanceNumber());
            readUserCommand(userCommand);
            validity = checkValidity(ship);
            if (!validity) {
                continue;
            }
            Cell[] cells = getCells();
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

    public void readUserCommand(iterator userCommand)  {
        Command command;
        int temp;
        while(userCommand.hasNext()){
            command = (Command)userCommand.next();
            if (command.isCol()||command.isStart()){
                startCol = command.getPos();
            }
            else if(!command.isCol()||command.isStart()){
                startRow = command.getPos();
            }
            else if(command.isCol()||!command.isStart()){
                endCol = command.getPos();
            }
            else {
                endRow = command.getPos();
            }
        }
        //switch user input, if it was given in reverse order

        if (endCol-startCol<0){
            temp = startCol;
            startCol = endCol;
            endCol =temp;
        }
        if (endRow-startRow<0){
            temp = startRow;
            startRow = endRow;
            endRow = temp;
        }
    }

    public boolean checkValidity(Boat ship){
        boolean validity = true;
        int len = ship.getLen();

        if (endRow-startRow+endCol-startCol +1 != len){
            validity = false;
            System.out.println(String.format("Wrong Boat length %d: length should be %d",
                    endRow-startRow+endCol-startCol + 1,len));
        }
        else if ((startRow > 9) || (startRow < 0) || (startCol > 9) || (startCol < 0) || (endRow < 0) || (endRow > 9) || (endCol < 0) || (endCol > 9)){
            validity = false;
            System.out.println("Out of Bounds");
        }
        else if ((startRow != endRow) && (startCol != endCol)){
            System.out.println("Ship must not be placed diagonally");
            validity = false;
        }
        //System.out.println("before returning validity");
        return validity;
    }




}

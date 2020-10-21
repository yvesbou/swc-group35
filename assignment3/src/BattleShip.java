package src;

public class BattleShip implements Boat{
    private Cell [] cells;
    private int instanceNumber;
    private int len = 4;
    private int startRow;
    private int endRow;
    private int startCol;
    private int endCol;
    private Board board;
    // constructor //
    public BattleShip(int instanceNumber,Board board) {
        this.board=board;
        this.instanceNumber=instanceNumber;
        setupBoat();
    }


    private void setupBoat() {
        boolean userInput = false;
        boolean validity;
        boolean empty;
        while (!userInput) {
            int[] userCommand;
            userCommand = HumanPlayer.getUserCommand("BattleShip", instanceNumber);
            readUserCommand(userCommand);
            validity = checkValidity();
            if (!validity) {
                continue;
            }
            markCells();
            empty = checkEmpty();
            if (!empty) {
                continue;
            } else {
                for (Cell cell : cells) {
                    cell.setBoat('B');
                    cell.setState(false);
                    userInput = true;
                }
            }
        }
    }
    public boolean checkEmpty() {
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

    public void markCells(){

        if (startCol == endCol){
            cells = board.getCol(startRow,endRow,endCol);
        }
        else {
            cells = board.getRow(startCol,endCol,startRow);
        }

    }
    public void readUserCommand(int[] userCommand)  {
            startRow = userCommand[0];
            endRow = userCommand[1];
            startCol = userCommand[2];
            endCol = userCommand[3];
        }

    public boolean checkValidity(){

        boolean validity = true;

        if (endRow-startRow+endCol-startCol +1 != len){
            validity = false;
            System.out.println("Wrong Boat length");
        }
        if ((startRow > 9) || (startRow < 0) || (startCol > 9) || (startCol < 0) || (endRow < 0) || (endRow > 9) || (endCol < 0) || (endCol > 9)){
            validity = false;
            System.out.println("Out of Bounds");
        }
        if ((startRow != endRow) && (startCol != endCol)){
            System.out.println("Ship must not be placed diagonally");
            validity = false;
        }
        return validity;
    }
}
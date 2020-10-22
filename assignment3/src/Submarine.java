package src;

public class Submarine {
    private Cell [] cells;
    private Board board;
    private int instanceNumber;
    private int len = 3;
    private int startRow;
    private int endRow;
    private int startCol;
    private int endCol;
    // constructor //
    public Submarine(int instanceNumber,Board board) {
        this.board = board;
        this.instanceNumber=instanceNumber;
        setupBoat();
    }


    private void setupBoat() {
        boolean userInput = false;
        boolean validity;
        boolean empty;
        while (!userInput) {
            int[] userCommand;
            userCommand = HumanPlayer.getPlacement("Submarine", instanceNumber);
            readUserCommand(userCommand);
            validity = checkValidity();
            if (!validity) {
                continue;
            }
            markCells();
            empty = checkEmpty();
            if (!empty) {
                break;
            } else {
                for (Cell cell : cells) {
                    cell.setBoat('S');
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
        startCol = userCommand[0];
        startRow = userCommand[1];
        endCol = userCommand[2];
        endRow = userCommand[3];
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
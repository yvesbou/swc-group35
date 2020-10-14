package src;

public class Submarine implements Boat{
    //private Cell [][] position;
    private Cell [] cells;
    //private Cell cell;
    private Board board;
    private Messenger messenger = new Messenger();
    private int instanceNumber;
    private int len = 3;

    // constructor //
    public Submarine(Board board,int instanceNumber){
        this.board = board;
        boolean userInput = false;
        boolean validity;
        boolean empty = true;

        while(!userInput){
            int[] userCommand;
            userCommand = messenger.getUserCommand("Submarine",instanceNumber);

            validity = checkValidity(userCommand);
            if (!validity){
                continue;
            }
            markCells(userCommand);
            for (int i = 0; i < cells.length; i++){
                Cell cell = cells[i];
                if(!checkEmpty(cell)){
                    empty = false;
                    System.out.println("The Cell " + cell.getCoordinates() +
                            " is occupied with boatType: "+cell.getBoat() );
                    break;

                }
                else{
                    empty=true;
                }
            }
            if (empty){
                for (Cell cell:cells){
                    cell.setBoat('S');
                    cell.setState(false);
                    userInput = true;
                }
            }
        }}



    public boolean checkEmpty(Cell cell){
        boolean output = true;
        if (!cell.isEmpty()){
            output = false;
        }
        return output;
    }

    public void markCells(int[] userCommand){
        int startRow = userCommand[0];
        int endRow = userCommand[1];
        int startCol = userCommand[2];
        int endCol = userCommand[3];
        if (startCol == endCol){
            cells = board.getCol(startRow,endRow,endCol);
        }
        else {
            cells = board.getRow(startCol,endCol,startRow);
        }

    }

    public boolean checkValidity(int[] userCommand){
        int startRow;
        int endRow;
        int startCol;
        int endCol;
        boolean validity = true;

        startRow = userCommand[0];
        endRow = userCommand[1];
        startCol = userCommand[2];
        endCol = userCommand[3];
        if (endRow-startRow+endCol-startCol +1!= len){
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
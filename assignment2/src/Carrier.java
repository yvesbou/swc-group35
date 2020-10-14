package src;

public class Carrier implements Boat{
    //private Cell [][] position;
    private Cell [] cells;
    //private Cell cell;
    private Board board;
    private Messenger messenger = new Messenger();
    private int instanceNumber;

    // constructor //
    public Carrier(Board board,int instanceNumber){
        this.board = board;
        boolean userInput = false;
        boolean validity;
        boolean Empty = true;

        while(!userInput){
            int[] userCommand;
            userCommand = messenger.getUserCommand("Carrier",instanceNumber);

            validity = checkValidity(userCommand);
            if (!validity){
                continue;
            }
            markCells(userCommand);
            for (Cell cell:cells){
                if(checkEmpty(cell)){
                    Empty = false;
                    break;
                };}
            if (Empty){
                for (Cell cell:cells){
                    cell.setBoat('C');
                    cell.setState(false);
                }
            }
        }}



    public boolean checkEmpty(Cell cell){
        boolean output = true;
        if (!cell.getState()){
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

        if ((startRow > 9) || (startRow < 0) || (startCol > 9) || (startCol < 0) || (endRow < 0) || (endRow > 9) || (endCol < 0) || (endCol > 9)){
            validity = false;
        }
        if (startRow != endRow && startCol != endCol){
            validity = false;
        }
        return validity;
    }
}
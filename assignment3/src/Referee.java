package src;

// checks if inputs in the console are valid
public abstract class Referee {
    private static int startCol;
    private static int endCol;
    private static int startRow;
    private static int endRow;
    public static boolean checkEmpty(Cell[] cells) {
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

    public static void readUserCommand(int[] userCommand)  {
        startCol = userCommand[0];
        endCol = userCommand[2];
        startRow = userCommand[1];
        endRow = userCommand[3];
        //switch user input, if it was given in reverse order

        if (endCol-startCol<0){
            startCol = userCommand[2];
            endCol = userCommand[0];
        }
        if (endRow-startRow<0){
            startRow = userCommand[3];
            endRow = userCommand[1];
        }

    }

    public static boolean checkValidity(Boat ship){
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


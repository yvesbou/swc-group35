package src;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
public class HumanPlayer implements Player{
    private Board board;
    private Fleet fleet;
    private String playerType= "HumanPlayer";
    private char[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    // SETTERS //
    public void setBoard(Board board){
        this.board = board;
    }
    public void setFleet(Fleet fleet){
        this.fleet = fleet;
    }
    // GETTERS //
    public String getPlayerType(){
        return playerType;
    }
    public Board getBoard(){
        Board boardCopy = new Board(board);
        return boardCopy;
    }
    public Fleet getFleet(){
        Fleet fleetCopy = new Fleet(fleet);
        return fleet;
    }
    public Command[] getPlacement(int boatLen,String boatType, int instanceNumber) {

        int startCol,startRow,endCol,endRow;
        String line;
        String[] positions;
        Scanner Input = new Scanner(System.in);
        while (true) {
             // checks code for exceptions
            System.out.println("Please enter the position of your " + boatType + instanceNumber + ":");
            line = Input.nextLine();
            positions = line.split(" ");
            try{
                Pattern p = Pattern.compile("^[A-Z][0-9] [A-Z][0-9]$");
                Matcher m = p.matcher(line);
                boolean b = m.matches();
                if (!b){throw new InputMismatchException();}
                break;
            }
            catch (InputMismatchException e) { //if an exception appears prints message below
                System.err.println("Try again, wrong input format. Format must be like A0 A5" );
                continue;// clear scanner wrong input
            }
                    // if no exceptions breaks out of loop
        }

        String str = positions[0];
        char a = str.charAt(0);
        String b = str.substring(1);
        startCol = new String(columns).indexOf(a);
        startRow = Integer.parseInt(b);

        str = positions[1];
        a = str.charAt(0);
        b = str.substring(1);
        endCol = new String(columns).indexOf(a);
        endRow = Integer.parseInt(b);
        Command startColCMD = new Command(startCol,true,true);
        Command startRowCMD = new Command(startRow,false,true);
        Command endColCMD = new Command(endCol,true,false);
        Command endRowCMD = new Command(endRow,false,false);

        Command[] placement = {startColCMD,startRowCMD,endColCMD,endRowCMD};

        return placement;
    }

    public int[] getShotCommand() {
        int[] shot = new int[2];
        String line;
        String[] positions;
        Pattern p;
        Matcher m;
        Scanner Input = new Scanner(System.in);

        //checking for incorrect input
        while (true) {
            // checks code for exceptions
            System.out.print("Enter the position you want to attack:");
            line = Input.nextLine();
            p = Pattern.compile("^[A-Z][0-9]$");
            boolean b = p.matcher(line).matches();
            try {

                if (!b) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) { //if an exception appears prints message below
                System.err.println("Try again, wrong input format. Format must be like A0");
                continue;
            }
            p = Pattern.compile("^[A-J][0-9]$");
            b = p.matcher(line).matches();
            try {

                if (!b) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) { //if an exception appears prints message below
                System.err.println("Try again, out of bounds, maximal column is J");
                continue;
            }
        }
        char a = line.charAt(0);
        String b = line.substring(1);
        shot[0] = new String(columns).indexOf(a);
        shot[1] = Integer.parseInt(b);

        return shot;
    }
    //belongs to iterator desing pattern
    public iterator createIterator(int boatLen,String boatType,int instanceNumber){
        Command[] placement;
        placement = getPlacement(boatLen,boatType, instanceNumber);
        return new HumanPlacementIterator(placement);
    }

    public boolean isAttackable(int[] attack){
        int col = attack[0];
        int row = attack[1];
        Cell cell = board.getCell(col,row) ;
        boolean attackable = !cell.getHit();
        return attackable;
        }

    public void getAttacked(int[] attack){
        int col = attack[0];
        int row = attack[1];
        Cell cell = board.getCell(col,row);
        Boat boat = cell.getBoat();
        char col_chr  = columns[col];
        System.out.println(String.format("The computer attacks position %c%d",col_chr ,row ));
        if(cell.isEmpty()){
            cell.setHit();
            System.out.println("The computer missed.");
        }
        else{
            cell.setHit();
            if (boat.isDestroyed()){
                System.out.print(String.format("Your %s was destroyed.",boat.getBoatType()));
            }

            else {

                System.out.println("Your boat was hit!");
            }
        };
        //cell.setHit();
    }


}


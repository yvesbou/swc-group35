package src;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
public class HumanPlayer implements Player{
    private char[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public int[] getPlacement(String boatType, int instanceNumber) {

        int[] userCommand = new int[4];
        String line;
        String[] positions;
        while (true) {
            Scanner Input = new Scanner(System.in);
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

        for (int i = 0; i < positions.length; i++) {

            String str = positions[i];
            char a = str.charAt(0);
            String b = str.substring(1);
            userCommand[2*i] = new String(columns).indexOf(a);
            userCommand[2*i + 1] = Integer.parseInt(b);
            //Format: startColumn startRow endColumn endRow
        }
        return userCommand;
    }

    public int[] getShotCommand() {
        int[] shot = new int[2];
        String line;
        String[] positions;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the position you want to attack:");
        line = Input.nextLine();
        char a = line.charAt(0);
        String b = line.substring(1);
        shot[0] = new String(columns).indexOf(a);
        shot[1] = Integer.parseInt(b);
        return shot;
    }

    public int[] getAttacked(int[] attack){
        int[] arr = {1,2};
        return arr;
    }

}


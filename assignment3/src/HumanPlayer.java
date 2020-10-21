package src;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class HumanPlayer {

    public static int[] getUserCommand(String boattype,int instanceNumber){
        char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int [] userCommand = new int[4];
        String line;
        String[] positions;
        while(true){
            Scanner Input = new Scanner(System.in);
            try { // checks code for exceptions
                System.out.println("Please enter the position of your "+boattype+ instanceNumber +":");
                line = Input.nextLine();
                positions = line.split(" ");
                System.out.println(positions.length);
                if (positions.length > 2){
                break;} // if no exceptions breaks out of loop

            }
            catch (InputMismatchException e) { //if an exception appears prints message below
                System.err.println("Try again, wrong format" + e.getMessage());
                Input.next(); // clear scanner wrong input
            }}



        for(int i=0; i<positions.length;i++){
            System.out.println(positions.length);
            String str = positions[i];
            char a = str.charAt(0);
            String b = str.substring(1);
            userCommand[i+2] = new String(columns).indexOf(a);
            userCommand[i]= Integer.parseInt(b);

            }
        return userCommand;
}}

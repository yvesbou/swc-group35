package src;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class Commander{

    public static int[] getUserCommand(String boattype,int instanceNumber){
        char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int [] userCommand = new int[4];
        String line;
        while(true){
            Scanner Input = new Scanner(System.in);
            try { // checks code for exceptions
                System.out.println("Please enter the position of your "+boattype+ instanceNumber +":");
                line = Input.nextLine();
                break; // if no exceptions breaks out of loop

            }
            catch (InputMismatchException e) { //if an exception appears prints message below
                System.out.println("Try again, wrong format" + e.getMessage());
                Input.next(); // clear scanner wrong input
                continue; // continues to loop if exception is found
            }}


        String[] positions = line.split(" ");
        for(int i=0; i<positions.length;i++){
            String str = positions[i];
            char a = str.charAt(0);
            String b = str.substring(1);
            userCommand[i+2] = new String(columns).indexOf(a);
            userCommand[i]= Integer.parseInt(b);

            }
        return userCommand;
}}

package src;
import java.util.Scanner;
public class Messenger {
    private char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    public int[] getUserCommand(String boattype,int instanceNumber){
        int [] userCommand = new int[4];
        System.out.println("Please enter the position of your "+boattype+ instanceNumber +":");
        Scanner Input = new Scanner(System.in);
        String line = Input.nextLine();
        String[] positions = line.split(" ");
        for(int i=0; i<positions.length;i++){
            String str = positions[i];
            //check
            char a = str.charAt(0);
            String b = str.substring(1);
            //check
            userCommand[i+2] = new String(columns).indexOf(a);
            userCommand[i]= Integer.parseInt(b);

        }
        return userCommand;
    }

}

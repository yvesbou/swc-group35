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
            char a = str.charAt(0);
            char b = str.charAt(1);
            userCommand[i] = new String(columns).indexOf(a);
            userCommand[i+1]= (int)b;
        }
        return userCommand;
    }
}

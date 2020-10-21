package src;
import java.util.Scanner;
public abstract class Commander{

    public static int[] getUserCommand(String boattype,int instanceNumber){
        char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int [] userCommand = new int[4];
        System.out.println("Please enter the position of your "+boattype+ instanceNumber +":");
        Scanner Input = new Scanner(System.in);
        String line = Input.nextLine();
        String[] positions = line.split(" ");
        for(int i=0; i<positions.length;i++){
            String str = positions[i];
            char a = str.charAt(0);
            String b = str.substring(1);
            userCommand[i+2] = new String(columns).indexOf(a);
            userCommand[i]= Integer.parseInt(b);

        }
        return userCommand;
    }

}

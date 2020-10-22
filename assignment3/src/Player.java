package src;

public interface Player {
    int[] getPlacement(String boatType,int instanceNumber);
    int[] getShotCommand();
    int[] getAttacked(int[] attack);

}

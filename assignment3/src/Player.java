package src;

public interface Player {
    int[] getPlacement(String boatType,int instanceNumber);
    int[] getShotCommand();
    String getPlayerType();
    boolean isAttackable(int[]shot);
    Fleet getFleet();
    Board getBoard();
    void setFleet(Fleet fleet);
    void setBoard(Board board);
    void getAttacked(int[] attack);


}

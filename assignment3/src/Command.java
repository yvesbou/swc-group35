package src;

public class Command {
    private int pos;
    private boolean isCol;
    private boolean isStart;
    Command(int pos,boolean isCol,boolean isStart){
        this.pos = pos;
        this.isCol = isCol;
        this.isStart = isStart;
    }
    int getPos(){
        return pos;
    }
    boolean isCol(){
        return isCol;
    }
    boolean isStart(){
        return isStart;
    }
}

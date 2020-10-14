package src;

public class BattleShip implements Boat {
    private Cell [][] position;
    private Cell [] cells;

    public BattleShip(){
        getUserCommand();
        checkValidity();
        cells = getCells(int startRow, int startCol, int endRow, int endCol);
        for (Cell cell:cells){
            if(checkEmpty(cell)){

                break;
            };

        }
        while(checkEmpty(cells)){
            markCells();

            cellinstance.setBoat();




    }
}

    public void markCells(){

    }

    public boolean checkEmpty(Cell cell){
        boolean output = true;
        if (!cell.getState()){
            output = false;
        }

        return output;
    }

    public Cell[] getCells(){

        return;
    }


}

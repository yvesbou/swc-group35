package src;

import java.lang.Exception;

//todo: consider making board to parent of fleet, battleship etc.

public class Board {
    private int numCols=10;
    private int numRows=10;
    private Cell [][] board= new Cell[numCols][numRows];
    private char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    private int [] rows = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Board(){
        initializeCells();
    }
    public void initializeCells(){
        for(int col =0; col<numCols;col++ ){
            for(int row =0;row <numRows;row++){
                board[row][col]= new Cell(row,col);
            }
        }
    }
    // GETTERS//
    public Cell[] getRow(int startCol, int endCol,int row) {
            Cell[] cells = new Cell[startCol - endCol + 1];
            for (int col = startCol; col <= endCol; col++) {
                cells[col] = board[row][col];
            }
        return cells;
    }
    public Cell[] getCol(int startRow,int endRow,int col){
        Cell[] cells = new Cell[startRow -endRow+1];
        for (int row=startRow;row <= endRow;row++){
            cells[row] = board[row][col];
        }
        return cells;
    }

    /*
    public void getBoard(){
        for(int row=0; row<cells.length; row++) {
            for(int column=0; column<cells[row].length; column++) {
                System.out.println("Boat at cell["+row+"]["+columns[column]+"] is "+cells[row][column]);
            }
        }

    };
    */
    /*
    public Cell getCell(int row, char column)
    {

        if (row < 0 || row > 9 || column not in possible characters) {
            throw new Exception("Index out of bound");
        }

        return cells[row][column];
    } */
}

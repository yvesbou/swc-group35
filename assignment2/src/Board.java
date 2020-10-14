package src;

import java.lang.Exception;
import java.util.Arrays;

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
    private void initializeCells(){
        for(int col =0; col<numCols;col++ ){
            for(int row =0;row <numRows;row++){
                board[row][col]= new Cell(row,col,this);
            }
        }
    }
    // GETTERS//
    public char[] getColumns(){
        return columns;
    }
    public Cell[] getRow(int startCol, int endCol,int row) {
            Cell[] cells = new Cell[endCol -startCol + 1];
            for (int col = startCol; col <= endCol; col++) {
                cells[col-startCol] = board[row][col];
            }
        return cells;
    }

    public Cell[] getCol(int startRow,int endRow,int col){
        Cell[] cells = new Cell[endRow- startRow+1];
        for (int row=startRow;row <= endRow;row++){
            cells[row-startRow] = board[row][col];
        }
        return cells;
    }


    public void printBoard(){
        System.out.println();
        System.out.println("Your board is:");
        System.out.println();
        System.out.print("   |");
        for (int i = 0; i <numCols;i++){
            System.out.print("["+columns[i]+"]");
        }
        System.out.println();
        System.out.println("---|------------------------------");
        for(int row=0; row<numRows; row++) {
            System.out.print("["+Integer.toString(row)+"]|");
            for(int column=0; column<numCols; column++) {
                Cell cell = board[row][column];
                System.out.print("["+cell.getBoat()+"]");
                //System.out.println("Boat at cell["+row+"]["+columns[column]+"] is "+board[row][column]);
            }
            System.out.println();
        }

    };

    /*
    public Cell getCell(int row, char column)
    {

        if (row < 0 || row > 9 || column not in possible characters) {
            throw new Exception("Index out of bound");
        }

        return cells[row][column];
    } */
}

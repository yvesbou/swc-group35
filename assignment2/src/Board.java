package src;

import java.lang.Exception;

public class Board {
    Boat [][] cells;
    char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    int [] rows = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void setCells(Cell specificCell){
        cells[specificCell.getRow()][specificCell.getColumn()] = specificCell.getBoat();
    }

    public void getBoard(){
        for(int row=0; row<cells.length; row++) {
            for(int column=0; column<cells[row].length; column++) {
                System.out.println("Boat at cell["+row+"]["+columns[column]+"] is "+cells[row][column]);
            }
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

public class Board {
    private String playerType;
    private int numCols=10;
    private int numRows=10;
    private Cell [][] board= new Cell[numCols][numRows];
    private char [] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    private int [] rows = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    // Default Constructor //
    public Board (){};
    // Parameterized Constructor //
    public Board(Player player){
        playerType=player.getPlayerType();
        initializeCells();
    }

    private void initializeCells(){
        for(int col =0; col<numCols;col++ ){
            for(int row =0;row <numRows;row++){
                board[row][col]= new Cell(row,col,this);
            }
        }
    }

    // Copy Constructor //
    public Board(Board oldBoard) {
        playerType = oldBoard.playerType;
        numCols = oldBoard.numCols;
        numRows = oldBoard.numRows;
        board = oldBoard.board; // should make use of copy constructor of cell
        columns = oldBoard.columns;
        rows = oldBoard.rows;
    }
    // GETTERS//
    public String getPlayerType(){
        return playerType;
    }
    public char[] getColNames(){
        return columns.clone();
    }

    public Cell getCell(int col, int row){
        return board[row][col];
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

}

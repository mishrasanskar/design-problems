package tictactoe.models;

import tictactoe.enums.Symbol;

public class Board {

    private final int size;
    private static int movesCount;
    private final Cell[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Cell[size][size];
        movesCount = 0;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell(Symbol.E);
            }
        }
    }

    public void setCell(int row, int col, Symbol symbol) {
        Cell cell = board[row][col];
        cell.setSymbol(symbol);
        movesCount++;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public Boolean isBoardFull(){
        return movesCount == size*size;
    }

    public int getSize() {
        return size;
    }
}

package chess.models;

import chess.enums.Color;
import chess.pieces.*;

public class Board {
    private Cell[][] board;

    public Board() {
        board = new Cell[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new Cell(row, col);
            }
        }

        setupPieces();
    }

    public boolean movePiece(Move move) {
        Cell start = move.getStart();
        Cell end = move.getEnd();
        Piece piece = start.getPiece();

        if(piece == null || !piece.canMove(this, start, end)) return false;
        end.setPiece(piece);
        start.setPiece(null);
        return true;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }
    public void setCell(int row, int col, Cell cell) {
        board[row][col] = cell;
    }

    public Piece getPiece(int row, int col) {
        return board[row][col].getPiece();
    }

    public void setPiece(int row, int col, Piece piece) {
        board[row][col].setPiece(piece);
    }

    private void setupPieces() {
        for (int j = 0; j < 8; j++) {
            board[1][j].setPiece(new Pawn(Color.W));
            board[6][j].setPiece(new Pawn(Color.B));
        }
        board[0][0].setPiece(new Rook(Color.W));
        board[0][1].setPiece(new Knight(Color.W));
        board[0][2].setPiece(new Bishop(Color.W));
        board[0][3].setPiece(new Queen(Color.W));
        board[0][4].setPiece(new King(Color.W));
        board[0][5].setPiece(new Bishop(Color.W));
        board[0][6].setPiece(new Knight(Color.W));
        board[0][7].setPiece(new Rook(Color.W));

        board[7][0].setPiece(new Rook(Color.B));
        board[7][1].setPiece(new Knight(Color.B));
        board[7][2].setPiece(new Bishop(Color.B));
        board[7][3].setPiece(new Queen(Color.B));
        board[7][4].setPiece(new King(Color.B));
        board[7][5].setPiece(new Bishop(Color.B));
        board[7][6].setPiece(new Knight(Color.B));
        board[7][7].setPiece(new Rook(Color.B));
    }

    public boolean isCheckMate(Color color) {
        return false;
    }

    public boolean isStaleMate(Color color) {
        return false;
    }

}

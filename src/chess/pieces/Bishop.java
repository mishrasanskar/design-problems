package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int rowDiff = Math.abs(start.getRow() - end.getRow());
        int colDiff = Math.abs(start.getCol() - end.getCol());
        return rowDiff == colDiff;
    }

}

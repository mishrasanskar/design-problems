package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public class King extends Piece {
    public King(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int rowDifference = Math.abs(start.getRow() - end.getRow());
        int colDifference = Math.abs(start.getCol() - end.getCol());
        return rowDifference <= 1 || colDifference <= 1;
    }
}

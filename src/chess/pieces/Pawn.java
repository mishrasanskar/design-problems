package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int rowDiff = Math.abs(start.getRow() - end.getRow());
        int colDiff = Math.abs(start.getCol() - end.getCol());

        return (rowDiff == 1 && colDiff == 0) ||
                ((start.getRow() == 1 || start.getRow()==6) && rowDiff == 2 && colDiff == 0) ||
                (rowDiff==1 && colDiff==1 && board.getPiece(end.getRow(), end.getCol()) != null);
    }
}


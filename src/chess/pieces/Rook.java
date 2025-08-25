package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public class Rook extends Piece{
    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        return start.getRow() == end.getRow() || start.getCol() == end.getCol();
    }
}

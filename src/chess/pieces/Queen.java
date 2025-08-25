package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int rowDiff = Math.abs(end.getRow() - start.getRow());
        int colDiff = Math.abs(end.getCol() - start.getCol());
        return (rowDiff == colDiff || (start.getRow() == end.getRow() || start.getCol() == end.getCol()));
    }
}

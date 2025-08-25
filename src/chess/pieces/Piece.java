package chess.pieces;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Cell;

public abstract class Piece {
    protected final Color color;
    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean canMove(Board board, Cell start, Cell end);
}

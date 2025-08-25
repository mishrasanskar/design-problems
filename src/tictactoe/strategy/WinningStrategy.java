package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Player player, Board board);
}

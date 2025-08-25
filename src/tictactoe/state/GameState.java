package tictactoe.state;

import tictactoe.GameController;
import tictactoe.models.Player;

public interface GameState {
    void handleMove(int row, int col, Player player, GameController gameController);
}

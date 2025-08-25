package tictactoe.state;

import tictactoe.GameController;
import tictactoe.models.Player;

public class Draw implements GameState {
    @Override
    public void handleMove(int row, int col, Player player, GameController gameController) {
        System.out.println("Game over");
    }
}

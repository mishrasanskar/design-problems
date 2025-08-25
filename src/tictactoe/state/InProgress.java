package tictactoe.state;

import tictactoe.GameController;
import tictactoe.enums.GameStatus;
import tictactoe.enums.Symbol;
import tictactoe.models.Player;

public class InProgress implements GameState {
    @Override
    public void handleMove(int row, int col, Player player, GameController gameController) {

        gameController.getBoard().setCell(row, col, player.getSymbol());

        if(gameController.checkWinner(player, gameController.getBoard())){
            gameController.setWinner(player);
            gameController.setGameState(new Won());
            gameController.setGameStatus(player.getSymbol() == Symbol.X ? GameStatus.X_WON : GameStatus.O_WON);
        }
        else if(gameController.getBoard().isBoardFull()){
            gameController.setGameState(new Draw());
            gameController.setGameStatus(GameStatus.DRAW);
            gameController.setWinner(null);
        }
        else{
            gameController.switchPlayer();
        }
    }
}
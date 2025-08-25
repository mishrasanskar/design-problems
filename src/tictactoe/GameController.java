package tictactoe;

import tictactoe.enums.GameStatus;
import tictactoe.models.Board;
import tictactoe.models.Player;
import tictactoe.state.GameState;
import tictactoe.state.InProgress;
import tictactoe.strategy.Col;
import tictactoe.strategy.Diagonal;
import tictactoe.strategy.Row;
import tictactoe.strategy.WinningStrategy;
import java.util.List;

public class GameController {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player winner;
    private GameStatus gameStatus;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    public GameController(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.gameState = new InProgress();
        this.winner = null;
        this.winningStrategies = List.of(new Col(), new Row(), new Diagonal());
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public  void makeMove(int row, int col, Player player){
        gameState.handleMove(row, col, player, this);
    }

    public void switchPlayer(){
        if(currentPlayer == player1){
            this.currentPlayer = player2;
        }
        else{
            this.currentPlayer = player1;
        }
    }

    public boolean checkWinner(Player player, Board board){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(player, board)){
                return true;
            };
        }
        return false;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

}

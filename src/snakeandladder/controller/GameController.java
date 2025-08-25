package snakeandladder.controller;

import snakeandladder.enums.GameStatus;
import snakeandladder.models.Board;
import snakeandladder.models.BoardEntity;
import snakeandladder.models.Dice;
import snakeandladder.models.Player;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameController {
    private final Board board;
    private Queue<Player> players;
    private final Dice dice;
    private GameStatus gameStatus;
    private Player winner;


    public GameController(List<Player> players, List<BoardEntity> boardEntities, int boardSize) {
        this.players = new LinkedList<>(players);
        this.dice = new Dice();
        this.board = new Board(boardSize, boardEntities);
    }
    public void play(){
        if(players.size() < 2){
            System.out.println("You need to enter at least two players!");
        }

        while(gameStatus == GameStatus.IN_PROGRESS){
            Player currentPlayer = players.poll();
            assert currentPlayer != null;
            takeTurn(currentPlayer);

            if (gameStatus == GameStatus.IN_PROGRESS) {
                players.add(currentPlayer);
            }
        }
        System.out.println("Game is over!");
        System.out.println("WINNER " + winner);
    }

    private void takeTurn(Player player){
        int numberOnDice = dice.rollDice();
        int currentPosition = player.getPlayerPosition();
        int nextPosition = currentPosition + numberOnDice;

        if(nextPosition > board.getSize()){
            System.out.println("Invalid, cannot move");
            return;
        } else if (nextPosition == board.getSize()) {
            player.setPlayerPosition(nextPosition);
            winner = player;
            gameStatus = GameStatus.GAME_OVER;
            System.out.println("Game Over");
            return;
        }

        int finalPosition = board.getFinalPosition(nextPosition);
        if(finalPosition > nextPosition){
            System.out.println("got ladder");
        }
        else if(finalPosition < nextPosition){
            System.out.println("got snake");
        }

        player.setPlayerPosition(finalPosition);
        if (numberOnDice == 6){
            System.out.println("another chance");
            takeTurn(player);
        }

    }
}

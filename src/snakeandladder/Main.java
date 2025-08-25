package snakeandladder;

import snakeandladder.controller.GameController;
import snakeandladder.models.BoardEntity;
import snakeandladder.models.Ladder;
import snakeandladder.models.Player;
import snakeandladder.models.Snake;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = List.of(
                new Player("Alice", 0),
                new Player("Bob", 0),
                new Player("Carl", 0));
        List<BoardEntity> boardEntities = List.of(
                new Snake(17, 7), new Snake(54, 34),
                new Snake(62, 19), new Snake(98, 79),
                new Ladder(3, 38), new Ladder(24, 33),
                new Ladder(42, 93), new Ladder(72, 84)
        );

        GameController gameController = new GameController(players, boardEntities, 100);
        gameController.play();
    }
}

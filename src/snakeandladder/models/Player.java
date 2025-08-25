package snakeandladder.models;

public class Player {
    private final String playerId;
    private int playerPosition;

    public Player(String playerId, int position) {
        this.playerId = playerId;
        this.playerPosition = position;
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int position) {
        this.playerPosition = position;
    }
}

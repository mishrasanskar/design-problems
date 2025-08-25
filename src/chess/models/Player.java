package chess.models;

import chess.enums.Color;

public class Player {
    private String name;
    private Color color;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
}

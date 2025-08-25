package snakeandladder.models;

public class Dice {
    private final int minVal = 1;
    private final int maxVal = 6;

    public int rollDice() {
        return (int) (Math.random() * (maxVal - minVal+1) + minVal);
    }
}

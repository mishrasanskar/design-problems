package tictactoe.models;

import tictactoe.enums.Symbol;

public class Player {
    private Symbol symbol;
    private int pId;

    Player(int pId, Symbol symbol) {
        this.pId = pId;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}

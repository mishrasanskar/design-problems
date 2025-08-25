package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Player;

public class Diagonal implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {

        for(int row = 0; row < board.getSize(); row++){
            int cnt = 0;
            for(int col = 0; col < board.getSize(); col++){
                if(row == col && board.getCell(row, col).getSymbol() == player.getSymbol()){
                    cnt++;
                }
            }
            if(cnt == board.getSize()){ return true; }
        }

        for(int row = 0; row < board.getSize(); row++){
            int cnt = 0;
            for(int col = 0; col < board.getSize(); col++){
                if(row == (board.getSize() - col - 1) && board.getCell(row, col).getSymbol() == player.getSymbol()){
                    cnt++;
                }
            }
            if(cnt == board.getSize()){ return true; }
        }

        return false;

    }
}

package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Player;

public class Row implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        for(int row = 0; row < board.getSize(); row++){
            int cnt = 0;
            for(int col = 0; col < board.getSize(); col++){
                if(player.getSymbol() == board.getCell(row, col).getSymbol()){
                    cnt+=1;
                }

                if(cnt == board.getSize()){return true;}
            }
        }
        return false;
    }
}

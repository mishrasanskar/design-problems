package chess;

import chess.controller.ChessController;

public class Main {
    public static void main(String[] args) {
        System.out.println("chess design practise");

        ChessController chessController = new ChessController();
        chessController.playGame();
    }
}

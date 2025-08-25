package chess.controller;

import chess.enums.Color;
import chess.models.Board;
import chess.models.Move;
import chess.models.Player;
import chess.pieces.Piece;

import java.util.Scanner;

public class ChessController {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;

    public ChessController() {
        this.board = new Board();
        this.whitePlayer = new Player("Alice", Color.W);
        this.blackPlayer = new Player("Bob", Color.B);
        this.currentPlayer = whitePlayer;
    }

    private boolean isGameOver() {
        return board.isCheckMate(whitePlayer.getColor()) || board.isCheckMate(blackPlayer.getColor())
                || board.isStaleMate(currentPlayer.getColor()) || board.isStaleMate(blackPlayer.getColor());
    }

    private void turnMove(){
        currentPlayer = currentPlayer ==  whitePlayer ? blackPlayer : whitePlayer;
    }

    private Move getMove(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source row: ");
        int sourceRow = scanner.nextInt();
        System.out.print("Enter source column: ");
        int sourceCol = scanner.nextInt();
        System.out.print("Enter destination row: ");
        int destRow = scanner.nextInt();
        System.out.print("Enter destination column: ");
        int destCol = scanner.nextInt();

        Piece piece = board.getPiece(sourceRow, sourceCol);
        if(piece == null || piece.getColor() != player.getColor()){
            return null;
        }
        return new Move(board.getCell(sourceRow, sourceCol), board.getCell(destRow, destCol));
    }


    public  void playGame(){
        while(!isGameOver()){
            Move currentMove = getMove(currentPlayer);

        }
    }


}

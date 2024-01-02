package chesSystem.application;

import java.util.Scanner;

import chesSystem.boardgame.Board;
import chesSystem.boardgame.Position;
import chesSystem.chess.ChessMatch;
import chesSystem.chess.ChessPiece;
import chesSystem.chess.ChessPosition;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Origem: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.print("Destino: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessPiece(source, target);
        }
        

    }
}

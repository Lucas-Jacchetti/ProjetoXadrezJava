package chesSystem.application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chesSystem.chess.ChessException;
import chesSystem.chess.ChessMatch;
import chesSystem.chess.ChessPiece;
import chesSystem.chess.ChessPosition;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();


        while (!chessMatch.getCheckMate()) {
            try{
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                
                
                System.out.println();
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessPiece(source, target);
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

                if (chessMatch.getPromoted() != null) {
                    System.out.print("Insira peça para promoção (B/C/T/D): ");
                    String type = sc.nextLine();
                    chessMatch.replacePromotedPiece(type);
                }
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
        
        

    }
}

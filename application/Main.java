package chesSystem.application;

import chesSystem.boardgame.Board;
import chesSystem.boardgame.Position;
import chesSystem.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        Position pos = new Position(3, 5);
        System.out.println(pos);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}

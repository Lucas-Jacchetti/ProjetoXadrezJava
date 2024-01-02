package chesSystem.chess;

import chesSystem.boardgame.Board;

public class Rook extends ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
        
    }

    @Override
    public String toString() {
        return "T";
    }

    
    
}

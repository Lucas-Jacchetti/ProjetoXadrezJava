package chesSystem.ChessPieces;

import chesSystem.boardgame.Board;
import chesSystem.chess.ChessPiece;
import chesSystem.chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "R";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
        
    }
    
}

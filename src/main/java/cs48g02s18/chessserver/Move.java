package cs48g02s18.chessserver;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import cs48g02s18.chessgame.Piece;

import java.awt.Point;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Move {
    private Point startPosition;
    private Point endPosition;

    public Move(Point startPosition, Point endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public Move(Piece pieceToMove, Point endPosition) {
        this.startPosition = new Point(pieceToMove.getXPosition(), pieceToMove.getYPosition());
        this.endPosition = endPosition;
    }

    public Point getStartPosition() {
        return startPosition;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setStartPosition(Point startPosition) {
        this.startPosition = startPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }
}

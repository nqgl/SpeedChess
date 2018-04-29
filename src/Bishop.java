/**
* This class implements the Piece interface and defines the specific behavior
* associated with game piece 'Bishop'
*/

import java.util.ArrayList;
import java.awt.Point;

public class Bishop extends Piece
{
  // Assuming that we are storing board positions as something like 'C2' (??)
  // possibly changes
  private ArrayList<Point> moves  = new ArrayList<Point>();

  // CONSTRUCTOR
  public Bishop(int x, int y) {
    this.setAlive(true);
    this.setPosition(x, y);
  }

  public String getName() {
  	return "Bishop";
  }

  // Precondition: Piece is on board. get the position of current spot
  // Postcondition: sets array of viable move options and stores into 'moves' arraylist
  public void setValidMoves(Board board, int x, int y) {

  
	}

	// for UI, call selectedPiece.getValidMoves(gameBoard)
	// returns arrayList of Points for valid moves of current piece position
  // NOTE: will possibly reconsider use of Points bc of return type double
	public ArrayList<Point> getValidMoves(Board board)
	{
		this.setValidMoves(board, Xposition, Yposition);
		return moves;
	}

  public int move(Board board, Point position) {
    // check if the position the piece wants to move to is in array of possible moves
    // if yes, update position -- setCurrentPosition(position)
    // if no, give error message -- depending on implementation of UI
    // function could just do nothing

    // no valid moves found
    // error message in UI

	return 0;
  }

}

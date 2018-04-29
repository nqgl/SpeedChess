/**
* This class implements the Piece interface and defines the specific behavior
* associated with game piece 'Queen'
*/
import java.util.ArrayList;
import java.awt.Point;

public class Queen extends Piece {
	// Assuming that we are storing board positions as something like 'C2'
	private ArrayList<Point> moves  = new ArrayList<Point>();

	public Queen(int x, int y) {
		this.setAlive(true);
		this.setPosition(x, y);
	}

	public String getName() {
		return "Queen";
	}

	public void setValidMoves(Board board, int x, int y, int playerType) {
		int vForward = y++;
		int vBackward = y--;
		while (board.getPiece(x, vForward) == null)
		{
			if(x < 8 && vForward < 8 && x >= 0 && vForward >= 0)
			{
				Point move = new Point(x, vForward);
				moves.add(move);
				vForward++;
			}
		}
		while (board.getPiece(x, vBackward) == null)
		{
			if(x < 8 && vBackward < 8 && x >= 0 && vBackward >= 0)
			{
				Point move = new Point(x, vBackward);
				moves.add(move);
				vBackward--;
			}
		}
		int hForward = x++;
		int hBackward = x--;
		while (board.getPiece(hForward, y) == null)
		{
			if(y < 8 && hForward < 8 && y >= 0 && hForward >= 0)
			{
				Point move = new Point(hForward, y);
				moves.add(move);
				hForward++;
			}
		}
		while (board.getPiece(hBackward, y) == null)
		{
			if(y < 8 && hBackward < 8 && y >= 0 && hBackward >= 0)
			{
				Point move = new Point(hBackward, y);
				moves.add(move);
				hBackward++;
			}
		}

		int xForward = x++;
		int yForward = y++;
		while (board.getPiece(xForward, yForward) == null)
		{
			if(xForward < 8 && yForward < 8 && xForward >= 0 && yForward >= 0)
			{
				Point move = new Point(xForward, yForward);
				moves.add(move);
				xForward++;
				yForward++;
			}
		}
		int xBackward = x--;
		int yBackward = y--;
		while (board.getPiece(xBackward, yBackward) == null)
		{
			if(xBackward < 8 && yBackward < 8 && xBackward >= 0 && yBackward >= 0)
			{
				Point move = new Point(xBackward, yBackward);
				moves.add(move);
				xBackward--;
				yBackward--;
			}
		}
		xForward = x--;
		yForward = y++;
		while (board.getPiece(xForward, yForward) == null)
		{
			if(xForward < 8 && yForward < 8 && xForward >= 0 && yForward >= 0)
			{
				Point move = new Point(xForward, yForward);
	      moves.add(move);
	      xForward--;
	      yForward++;
			}
		}
		xBackward = x++;
		yBackward = y--;
		while (board.getPiece(xBackward, yBackward) == null)
		{
			if(xBackward < 8 && yBackward < 8 && xBackward >= 0 && yBackward >= 0)
			{
				Point move = new Point(xBackward, yBackward);
				moves.add(move);
				xBackward++;
				yBackward--;
			}
		}
	}

	public ArrayList<Point> getValidMoves(Board board, int playerType) {
		ArrayList<Point> valid = new ArrayList<Point>();
		//code
		return valid;
	}

	public int move(Board board, int position) {
		// check if the position the piece wants to move to is in array of possible moves
		// if yes, update position -- setCurrentPosition(position)
		// if no, give error message -- depending on implementation of UI
		// function could just do nothing

		// no valid moves found
		// error message in UI

		return 0;
	}
}

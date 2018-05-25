package cs48g02s18.chessGame;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Piece {
	protected int Xposition;
	protected int Yposition;
	protected boolean status;
	protected int player;
	private Board gameBoard; // add so that we can just tell a piece to move itself or take itself off the board etc

	// check if piece is still on board
	public boolean isAlive()
	{
		return status;
	}

	public void setAlive(boolean alive)
	{
		status = alive;
	}

	public void setPosition(int x, int y) {
		Xposition = x;
		Yposition = y;
		gameBoard.movePiece(this, x,y);
	}
	public void setPosition(Point point) {
		gameBoard.movePiece(this, point.x, point.y);
	}


	public Point getPosition() {return new Point(Xposition, Yposition);}

	public int getXPosition()
	{
		return Xposition;
	}

	public int getYPosition()
	{
		return Yposition;
	}

	public abstract void setValidMoves(Board board, int x, int y, int playerType);

	public abstract ArrayList<Point> getValidMoves(Board board, int playerType);

	public abstract String getName();

	public int getPlayer() {
		return player;
	}
	public void setPlayer(int p) {
		player = p;
	}

	public void capture() {
		setAlive(false);
		setPosition(-1, -1);
	}
	public abstract void move(int x, int y);


	@Override
	public String toString() { return getName(); }
}
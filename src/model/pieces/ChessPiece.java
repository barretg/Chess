package model.pieces;

import java.awt.Graphics;

public abstract class ChessPiece {
	
	protected boolean color;
	
	/**
	 * Constructor for a chess piece
	 * @param c The color of the piece (true: white, false: black)
	 */
	public ChessPiece(boolean c) {
		color = c;
	}
	
	public abstract void paint(Graphics g);
	public abstract void move(int x, int y);
	
}

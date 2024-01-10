package com.epam.piece;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.PieceType;

import java.util.List;

public abstract class Piece {

	private Color color;
	private PieceType type;
	private int[][] position;

	public Piece(Color color, PieceType type, int[][] position) {
		this.color = color;
		this.type = type;
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public PieceType getType() {
		return type;
	}

	public void setType(PieceType type) {
		this.type = type;
	}

	public int[][] getPosition() {
		return position;
	}

	public void setPosition(int[][] position) {
		this.position = position;
	}

	// Abstract methods
	public abstract List<int[]> getPossibleMoves(Board board, int[] currentPosition);

	public abstract boolean isValidMove();

	public abstract void move();

	public PieceType getPieceType() {
		return type;
	}
}

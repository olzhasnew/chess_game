package com.epam.board;

import com.epam.piece.Piece;

public class Square {

	private Piece piece;

	public Square(Piece piece) {
		this.piece = piece;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(int[] position, Piece piece) {
		// Implementing setPiece with position parameter
		this.piece = piece;
		piece.setPosition(new int[][] {position});
	}
}

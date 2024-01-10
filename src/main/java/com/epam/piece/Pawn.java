package com.epam.piece;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.PieceType;

import java.util.List;

public class Pawn extends Piece {

	public Pawn(Color color, PieceType type, int[][] position) {
		super(color, type, position);
	}

	@Override
	public List<int[]> getPossibleMoves(Board board, int[] currentPosition) {
		// TODO: Implement pawn's possible moves logic here
		return null;
	}

	@Override
	public boolean isValidMove() {
		// TODO: Implement pawn's valid move logic here
		return false;
	}

	@Override
	public void move() {
		// TODO: Implement pawn's move logic here
	}
}

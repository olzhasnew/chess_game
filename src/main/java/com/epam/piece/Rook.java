package com.epam.piece;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.PieceType;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

	public Rook(Color color, PieceType type, int[][] position) {
		super(color, type, position);
	}

	@Override
	public List<int[]> getPossibleMoves(Board board, int[] currentPosition) {

        // TODO: Implement rook's possible moves logic here

		return new ArrayList<>();
	}

	@Override
	public boolean isValidMove() {
		// TODO: Implement rook's valid move logic here
		return false;
	}

	@Override
	public void move() {
		// TODO: Implement rook's move logic here
	}
}

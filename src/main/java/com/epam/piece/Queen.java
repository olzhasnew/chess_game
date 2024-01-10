package com.epam.piece;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.PieceType;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

	public Queen(Color color, PieceType type, int[][] position) {
		super(color, type, position);
	}

	@Override
	public List<int[]> getPossibleMoves(Board board, int[] currentPosition) {

        // TODO: Implement queen's possible moves logic here

		return new ArrayList<>();
	}

	@Override
	public boolean isValidMove() {
		// TODO: Implement queen's valid move logic here
		return false;
	}

	@Override
	public void move() {
		// TODO: Implement queen's move logic here
	}
}

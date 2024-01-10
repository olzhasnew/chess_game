package com.epam.piece;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.PieceType;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

	public King(Color color, PieceType type, int[][] position) {
		super(color, type, position);
	}

	@Override
	public List<int[]> getPossibleMoves(Board board, int[] currentPosition) {

        // TODO: Implement king's possible moves logic here

		return new ArrayList<>();
	}

	@Override
	public boolean isValidMove() {
		// TODO: Implement king's valid move logic here
		return false;
	}

	@Override
	public void move() {
		// TODO: Implement king's move logic here
	}
}

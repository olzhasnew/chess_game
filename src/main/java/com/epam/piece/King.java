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
	public boolean isValidMove() {
		// Implement King's isValidMove logic
		return true; // Replace with the actual logic
	}

	@Override
	public void move() {
		// Implement King's move logic
		// Update the piece's position, considering the move rules for the king
	}

	@Override
	public List<int[]> getPossibleMoves(Board board, int[] currentPosition) {
		List<int[]> possibleMoves = new ArrayList<>();
		int x = currentPosition[0];
		int y = currentPosition[1];

		// Check all 8 possible directions
		int[][] directions = {
				{-1, -1}, {-1, 0}, {-1, 1},
				{0, -1},           {0, 1},
				{1, -1}, {1, 0}, {1, 1}
		};

		for (int[] direction : directions) {
			int newX = x + direction[0];
			int newY = y + direction[1];

			if (isValidMove() && isValidMove(board, newX, newY) && (board.getPiece(new int[]{newX, newY}) == null
					|| board.getPiece(new int[]{newX, newY}).getColor() != getColor())) {
				possibleMoves.add(new int[]{newX, newY});
			}
		}
		return possibleMoves;
	}

	private boolean isValidMove(Board board, int x, int y) {
		// Implement specific conditions for a valid move of the King
		// Example: Check if the new position is within the board boundaries
		return x >= 0 && x < 8 && y >= 0 && y < 8;
	}
}

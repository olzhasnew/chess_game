package com.epam.game;

import com.epam.board.Board;
import com.epam.enums.Color;
import com.epam.enums.GameStatus;

public class Game {

	private Board board;
	private Player currentPlayer;

	public void startGame() {
		this.board = new Board();
		this.currentPlayer = new Player(Color.BLACK); // Start with black player
	}

	public void makeMove(int[] fromPosition, int[] toPosition) {
		if (board.isSquareOccupied(fromPosition) && board.getPiece(fromPosition).getColor() == currentPlayer.getColor()) {
			// Check if the piece belongs to the current player
			board.movePiece(fromPosition, toPosition);
			switchPlayers();
		} else {
			// Invalid move, handle accordingly
		}
	}

	public GameStatus getGameStatus() {
		// TODO: Implement logic to determine the game status (e.g., check for checkmate, stalemate, etc.)
		return GameStatus.IN_PROGRESS;
	}

	private void switchPlayers() {
		currentPlayer = (currentPlayer.getColor() == Color.BLACK) ? new Player(Color.WHITE) : new Player(Color.BLACK);
	}
}

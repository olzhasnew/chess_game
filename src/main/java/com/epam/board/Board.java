package com.epam.board;

import com.epam.enums.Color;
import com.epam.enums.PieceType;
import com.epam.piece.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private final Square[][] squares = new Square[8][8];

	public Board() {
		initializeBoard();
	}

	private void initializeBoard() {
		// Initialize board with pieces in their starting positions
		squares[0][0] = new Square(new Rook(Color.BLACK, PieceType.ROOK, new int[][]{{0, 0}}));
		squares[0][1] = new Square(new Knight(Color.BLACK, PieceType.KNIGHT, new int[][]{{0, 1}}));
		squares[0][2] = new Square(new Bishop(Color.BLACK, PieceType.BISHOP, new int[][]{{0, 2}}));
		squares[0][3] = new Square(new Queen(Color.BLACK, PieceType.QUEEN, new int[][]{{0, 3}}));
		squares[0][4] = new Square(new King(Color.BLACK, PieceType.KING, new int[][]{{0, 4}}));
		squares[0][5] = new Square(new Bishop(Color.BLACK, PieceType.BISHOP, new int[][]{{0, 5}}));
		squares[0][6] = new Square(new Knight(Color.BLACK, PieceType.KNIGHT, new int[][]{{0, 6}}));
		squares[0][7] = new Square(new Rook(Color.BLACK, PieceType.ROOK, new int[][]{{0, 7}}));

		squares[7][0] = new Square(new Rook(Color.WHITE, PieceType.ROOK, new int[][]{{7, 0}}));
		squares[7][1] = new Square(new Knight(Color.WHITE, PieceType.KNIGHT, new int[][]{{7, 1}}));
		squares[7][2] = new Square(new Bishop(Color.WHITE, PieceType.BISHOP, new int[][]{{7, 2}}));
		squares[7][3] = new Square(new Queen(Color.WHITE, PieceType.QUEEN, new int[][]{{7, 3}}));
		squares[7][4] = new Square(new King(Color.WHITE, PieceType.KING, new int[][]{{7, 4}}));
		squares[7][5] = new Square(new Bishop(Color.WHITE, PieceType.BISHOP, new int[][]{{7, 5}}));
		squares[7][6] = new Square(new Knight(Color.WHITE, PieceType.KNIGHT, new int[][]{{7, 6}}));
		squares[7][7] = new Square(new Rook(Color.WHITE, PieceType.ROOK, new int[][]{{7, 7}}));

		// Initialize pawns
		for (int i = 0; i < 8; i++) {
			squares[1][i] = new Square(new Pawn(Color.BLACK, PieceType.PAWN, new int[][]{{1, i}}));
			squares[6][i] = new Square(new Pawn(Color.WHITE, PieceType.PAWN, new int[][]{{6, i}}));

		}
	}


	public boolean isSquareOccupied(int[] position) {
		return isValidPosition(position) && squares[position[0]][position[1]] != null && squares[position[0]][position[1]].getPiece() != null;
	}

	public Piece getPiece(int[] position) {
		if (isValidPosition(position)) {
			Square square = squares[position[0]][position[1]];
			return (square != null) ? square.getPiece() : null;
		}
		return null;
	}

	public void setPiece(int[] position, Piece piece) {
		if (isValidPosition(position)) {
			squares[position[0]][position[1]].setPiece(position, piece);
		}
	}

	public List<int[]> getPossibleMoves(Color color) {
		List<int[]> possibleMoves = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Square square = squares[i][j];
				if (square != null && square.getPiece() != null && square.getPiece().getColor() == color) {
					possibleMoves.addAll(square.getPiece().getPossibleMoves(this, new int[]{i, j}));
				}
			}
		}
		return possibleMoves;
	}

	public void movePiece(int[] fromPosition, int[] toPosition) {
		if (isValidPosition(fromPosition) && isValidPosition(toPosition)) {
			Square fromSquare = squares[fromPosition[0]][fromPosition[1]];
			Square toSquare = squares[toPosition[0]][toPosition[1]];

			if (fromSquare != null && toSquare != null) {
				Piece piece = fromSquare.getPiece();
				if (piece != null && piece.isValidMove()) {
					fromSquare.setPiece(fromPosition, null);
					toSquare.setPiece(toPosition, piece);
					piece.setPosition(new int[][]{new int[]{toPosition[0], toPosition[1]}});
				}
			}
		}
	}

	public void printBoard() {
		System.out.println("   a b c d e f g h");
		System.out.println("  -----------------");
		for (int i = 7; i >= 0; i--) {
			System.out.print(i + 1 + "| ");
			for (int j = 0; j < 8; j++) {
				Piece piece = squares[i][j].getPiece();
				if (piece != null) {
					System.out.print(piece.getPieceType().toString().charAt(0) + " ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println("|");
		}
		System.out.println("  -----------------");
	}

	private boolean isValidPosition(int[] position) {
		return position[0] >= 0 && position[0] < 8 && position[1] >= 0 && position[1] < 8;
	}
}

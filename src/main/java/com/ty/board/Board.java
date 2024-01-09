package com.ty.board;

import java.util.ArrayList;
import java.util.List;

import com.ty.enums.Color;
import com.ty.enums.PieceType;
import com.ty.piece.Bishop;
import com.ty.piece.King;
import com.ty.piece.Knight;
import com.ty.piece.Piece;
import com.ty.piece.Rook;

public class Board {
		
	    private Square[][] squares = new Square[8][8];

	    public Board() {
	        // Initialize board with pieces in their starting positions
	        squares[0][0] = new Square(new Rook(Color.BLACK,PieceType.ROOK,new int[0][0]));
	        squares[0][1] = new Square(new Knight(Color.BLACK,PieceType.KNIGHT,new int[0][1]));
	        squares[0][2] = new Square(new Bishop(Color.BLACK,PieceType.BISHOP,new int[0][2]));
	        // Place other pieces based on starting setup
	        
	        //White
	        squares[7][0]=new Square(new Rook(Color.WHITE,PieceType.ROOK,new int[7][0]));
	        
	    }

	    public boolean isSquareOccupied(int[] position) {
	        
	    	return false;
	    }

	    public List<int[]> getPossibleMoves(Color color) {
	        
	    	
	    	return null;
	    }

	    public void movePiece(int[] fromPosition, int[] toPosition) {
	        
	    	
	    }

	    public void printBoard() {
	        
	    	//Print the Board
	    }
	}

package com.ty.piece;

import com.ty.enums.Color;
import com.ty.enums.PieceType;

public class Pawn extends Piece
{

	public Pawn(Color color, PieceType type, int[][] position) {
		super(color, type, position);
	}

	@Override
	public boolean isValidMove() {
		//Write the logic
		
		return false;
	}

	@Override
	public void move() {
		//Write the logic
		
	}
	
}

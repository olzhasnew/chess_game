package com.ty.game;

import com.ty.board.Board;

public class Game {

	 private Board board;
	 private Player currentPlayer ;

	    public void startGame() 
	    {
	        this.board = new Board();
	        this.currentPlayer = new Player(); // Start with black player
	    }
	    
	    
}

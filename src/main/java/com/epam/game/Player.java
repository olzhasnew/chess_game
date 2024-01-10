package com.epam.game;

import com.epam.enums.Color;

public class Player {

	private int id;
	private Color color;

	public Player(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}

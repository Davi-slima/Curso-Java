package entities;

import entities.enums.Color;

public abstract class Shape { /* PARA TER UM M�TODO ABSTRATO, PRECISA-SE QUE A MINHA CLASSE TAMB�M SEJA ABSTRATA */
	
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area(); 
}

package entities;

import entities.enums.Color;

public abstract class Shape { /* PARA TER UM MÉTODO ABSTRATO, PRECISA-SE QUE A MINHA CLASSE TAMBÉM SEJA ABSTRATA */
	
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

package entities;

public class Rectangle {
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return (width + heigth) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + heigth * heigth);
	}
}

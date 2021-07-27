package util;

public class Calculator {

	public static final double PI = 3.14159; // A palavra final é utilizada para informar que o valor da variável não irá mudar mais
	
	public static double circunference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}

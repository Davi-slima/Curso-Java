import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); 
		
		showResult(higher);
		
		sc.close();
	}
	
	
	public static int max(int x, int y, int z) { // Fun��o que ir� me retornar o valor do maior n�mero digitado
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) { // Fun��o que apenas ir� me aprentar na tela o meu resultado
		System.out.println("Higher = " + value);
	}
	
}

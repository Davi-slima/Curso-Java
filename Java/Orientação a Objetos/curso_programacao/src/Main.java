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
	
	
	public static int max(int x, int y, int z) { // Função que irá me retornar o valor do maior número digitado
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

	public static void showResult(int value) { // Função que apenas irá me aprentar na tela o meu resultado
		System.out.println("Higher = " + value);
	}
	
}

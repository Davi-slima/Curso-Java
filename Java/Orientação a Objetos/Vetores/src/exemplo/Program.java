package exemplo;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {  // Length tem a função de identificar o tamanho do Vetor. Ou seja, sempre que eu precisar 
			sc.nextLine();						// verificar o tamanho do meu vetor, basta somente usar o VECT.LENGTH que ele irá saber o tamnho dele.
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) { // VECT.LENGTH pode ser utilizado no lugar do tamnho do meu vetor que no caso é N.
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();
	}

}

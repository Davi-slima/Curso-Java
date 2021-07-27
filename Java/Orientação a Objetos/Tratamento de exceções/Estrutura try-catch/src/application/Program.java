package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try { // ESSA FUNÇÂO ( TRY ) FAZ A TENTATIVA DE RODAR O MEU PROGRAMA COM AS EXCESSÂO
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e){   // ESSA FUNÇÂO CAPTURA A MINHA EXCESSÂO E AO  
			System.out.println("Invalid position"); // INVÉS DE IMPRIMIR
		}											// UM ERRO, ELE VAI ME MOSTRAR UMA MENSAGEM.
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program!!!");
		
		sc.close();
	}

}

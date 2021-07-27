package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try { // ESSA FUN��O ( TRY ) FAZ A TENTATIVA DE RODAR O MEU PROGRAMA COM AS EXCESS�O
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e){   // ESSA FUN��O CAPTURA A MINHA EXCESS�O E AO  
			System.out.println("Invalid position"); // INV�S DE IMPRIMIR
		}											// UM ERRO, ELE VAI ME MOSTRAR UMA MENSAGEM.
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program!!!");
		
		sc.close();
	}

}

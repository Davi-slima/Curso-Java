package exercicio_de_fixacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert M of matrix: ");
		int M = sc.nextInt();
		System.out.print("Insert N of matrix: ");
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Insert one you want to find in the matrix: ");
		
		int X = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				
				if (mat[i][j] == X) {
					System.out.println("\nPosition " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}

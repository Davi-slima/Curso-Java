package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		System.out.print("How many students for course A?: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			A.add(number);
		}
		
		System.out.print("How many students for course B?: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i ++) {
			int number = sc.nextInt();
			B.add(number);
		}
		
		System.out.print("How many students for course C?: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			C.add(number);
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total student: " + total.size());
		

	sc.close();
	}

}

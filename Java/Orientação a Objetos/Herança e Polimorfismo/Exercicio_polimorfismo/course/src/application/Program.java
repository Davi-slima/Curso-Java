package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsurcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the numbers of employees: ");
		int N = sc.nextInt();
		
		System.out.println("----------------------------------------------");
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Employee #" + i + " data:");

			System.out.print("Outsurced (y/n)?: ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("----------------------------------------------");
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				System.out.println("----------------------------------------------");
				list.add(new OutsurcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else{
				list.add(new Employee(name, hours, valuePerHour)); // SIMPLIFIQUEI APENAS A MINHA INSTANCIAÇÂO DO MEU FUNCIONÁRIO
			}
				
		}
		System.out.println();
		
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}

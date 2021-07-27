package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Coleta dos dados do trabalhador
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		// Instanciando a classe trabalhador
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		//Dados de contrato do Trabalhador
		
		System.out.print("How many contracts to this worker?: ");
		int n = sc.nextInt();
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			System.out.println("-----------------------------------------------------------");			
			//Instanciando o contrato associado com o trabalhador
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); //Recorta a string gerando um sbstring com 2 d�gitos
		int year = Integer.parseInt(monthAndYear.substring(3)); // L� o ano da posi��o 3 em diante
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}

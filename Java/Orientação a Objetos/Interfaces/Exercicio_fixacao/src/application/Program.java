package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractPayment;
import model.services.PypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println();
		System.out.println("Enter contract data");
		System.out.println("--------------------------------");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract Value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract((double) number, date, totalValue);
		
		System.out.println("--------------------------------");
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractPayment contractPayment = new ContractPayment(new PypalService());
		
		
		contractPayment.processContract(contract, n);
		
		System.out.println("--------------------------------");
		System.out.println("Installments:");
		
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");
		
		sc.close();
	}

}

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// DISCOUNT WITHDRAW ACCOUNT // Withdraw com o desconto de 5.0 que foi implementado na classe Account
		
		System.out.println("DISCOUNT WITHDRAW: ");
		Account account = new Account(1000, "Marcelo", 1000.00);
		account.withdraw(200.0);
		System.out.println("Marcelo \n" + "R$ " + account.getBalance() + "\n");
		
		// WITHDRAW WITHOUT DISCOUNT // Withdraw sem o desconto prevalecido na classe SavingsAccount
		
		System.out.println("WITHDRAW WITHOUT DISCOUNT: ");
		Account account2 = new SavingsAccount(1005, "Carla", 1000.0, 0.01);
		account2.withdraw(200.0);
		System.out.println("Carla \n" + "R$ " + account2.getBalance() + "\n");
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println(acc5.toString());
		}
	}

}

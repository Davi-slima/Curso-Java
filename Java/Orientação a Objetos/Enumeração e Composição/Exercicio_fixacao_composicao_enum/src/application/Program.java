package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); // ValueOF converte a String para o valor correspondente definido no OrderStatus.
		
		Order order = new Order(new Date(), status, client); // New Date utiliza o hor�rio do sistema. Ou seja, ele vai pegar a data em tempo real
		
		System.out.println();
		
		System.out.print("How many itemns to this order?: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine(); // Esse nextLine consome a quebra de linha que ficou pendente no int n.
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItems(it);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		
		sc.close();
	}

}

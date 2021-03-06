package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
// # REMOVENDO ITENS DA LISTA ATRAV?S DA REFERENCIA DO METODO STATIC: # //
		
		list.removeIf(Product :: staticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}

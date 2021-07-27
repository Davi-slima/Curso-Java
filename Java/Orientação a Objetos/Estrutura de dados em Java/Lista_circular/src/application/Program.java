package application;

import application.entities.ListaCircular;

public class Program {
	
	public static void main(String[] args) {
		
		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("C0");
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		System.out.println(minhaLista);
		
		minhaLista.add("C1");
		System.out.println(minhaLista);
		
		minhaLista.add("C2");
		minhaLista.add("C3");
		System.out.println(minhaLista);
/*		
		System.out.println(minhaLista.get(0));
		System.out.println(minhaLista.get(1));
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3)); // Ele vai imprimir o indice que est� na minha posi��o 0
		System.out.println(minhaLista.get(4)); // Ele vai imprimir o indice que est� na minha posi��o 1
*/
		for (int i = 0; i < 20; i ++) {
			System.out.println(minhaLista.get(i));
		}
	}
}

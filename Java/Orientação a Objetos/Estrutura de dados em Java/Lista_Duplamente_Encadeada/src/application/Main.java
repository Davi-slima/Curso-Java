package application;

import application.entities.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista<String> minhaListaEncadeada = new Lista<>();
		
		minhaListaEncadeada.add("C1");
		minhaListaEncadeada.add("C2");
		minhaListaEncadeada.add("C3");
		minhaListaEncadeada.add("C4");
		minhaListaEncadeada.add("C5");
		minhaListaEncadeada.add("C6");
		minhaListaEncadeada.add("C7");
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(3);
		minhaListaEncadeada.add("99", 3);
		System.out.println(minhaListaEncadeada);
		System.out.println(minhaListaEncadeada.get(3));
		
	}

}

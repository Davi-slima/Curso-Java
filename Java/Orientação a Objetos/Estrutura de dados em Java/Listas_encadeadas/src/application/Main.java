package application;

import application.entities.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista<String> minhaListaEncadeada = new Lista<>();
		
		minhaListaEncadeada.add("Test 1");
		minhaListaEncadeada.add("Test 2");
		minhaListaEncadeada.add("Test 3");
		minhaListaEncadeada.add("Test 4");
		
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println(minhaListaEncadeada);
		
		System.out.println(minhaListaEncadeada.remove(3));
		System.out.println(minhaListaEncadeada);		
	}

}

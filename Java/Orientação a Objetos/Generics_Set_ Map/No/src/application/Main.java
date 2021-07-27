package application;

import entities.No;

public class Main {

	public static void main(String[] args) {
		
		// Lista de n�s encadeados
		
		No<String> no1 = new No<>("Conte�do No1");
		
		No<String> no2 = new No<>("Conte�do No2"); // N� 1 aponta para o n� 2
		no1.setProxioNo(no2);
		
		No<String> no3 = new No<>("Conte�do No3"); // N� 2 aponta para o n� 3
		no2.setProxioNo(no3);
		
		No<String> no4 = new No<>("Conteudo No4"); // N� 3 aponta para o n� 4
		no3.setProxioNo(no4);
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(no1.getProxioNo());
		System.out.println(no1.getProxioNo().getProxioNo());
		System.out.println(no1.getProxioNo().getProxioNo().getProxioNo());
		System.out.println(no1.getProxioNo().getProxioNo().getProxioNo().getProxioNo());
	}

}

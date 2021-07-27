package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		
		endereco.cep = "12345678901";
		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		}catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
		}
	}

}

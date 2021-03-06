package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	private List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("O endere?o n?o pode ser nullo");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("O CEP n?o pode ser nullo");
		}
		getEnderecos().add(endereco);
	}

	public List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}

}

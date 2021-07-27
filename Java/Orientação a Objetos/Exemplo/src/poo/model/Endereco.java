package poo.model;

public class Endereco {
	
	public enum tipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}

	public String endereco;
	public String bairro;
	public String estado;
	public String Cidade;
	public String numero;
	public String complemento;
	public String cep;
	public tipoEndereco tipo;
	
	
}

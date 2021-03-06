package poo.model;

public class Pessoa {
	
	public static final int TAMANHO_CPF = 11;
	public static final int TAMANHO_CNPJ = 14;
	
	public enum tipoPessoa {FISICA, JURIDICA}
	
	public Integer codigo;
	public String nome;
	private String documento;
	public tipoPessoa tipo;
	
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("O documento n?o pode ser nulo ou vazio!");
		}
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipoPessoa.FISICA);
		}else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipoPessoa.JURIDICA);
		}
		else {
			throw new RuntimeException("O documento ? inv?lido para pessoa F?sica ou jur?dica");
		}
	}
	
	private void setDocumento(String documento, tipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	public String getDocumento() {
		return documento;
	}

}

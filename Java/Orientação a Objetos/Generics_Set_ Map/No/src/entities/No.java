package entities;

public class No<T> {
	
	private T conteudo; // Conte�do de qualquer tipo... Tipo Gen�ric
	private No<T> proxioNo;
	
	public No(T conteudo) {
		this.proxioNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProxioNo() {
		return proxioNo;
	}

	public void setProxioNo(No<T> proxioNo) {
		this.proxioNo = proxioNo;
	}

	@Override
	public String toString() {
		return "No { conteudo = " + conteudo + " }";
	}
	
	

}

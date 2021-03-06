package application.entities;

public class No<T> {
	
	private T conteudo;
	private No<T> proxNo;
	
	public No() {
	}
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proxNo = null;
	}



	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProxNo() {
		return proxNo;
	}

	public void setProxNo(No<T> proxNo) {
		this.proxNo = proxNo;
	}

	@Override
	public String toString() {
		return "No [ Conte?do = " + conteudo + " ]";
	}
	
	
}

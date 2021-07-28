package application.entities;

public class BinNo <T extends Comparable<T>> {
	
	private T conteudo;
	private BinNo<T> esq;
	private BinNo<T> dir;
	
	public BinNo() {
	}
	
	public BinNo(T conteudo) {
		this.conteudo = conteudo;
		esq = null;
		dir = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNo<T> getEsq() {
		return esq;
	}

	public void setEsq(BinNo<T> esq) {
		this.esq = esq;
	}

	public BinNo<T> getDir() {
		return dir;
	}

	public void setDir(BinNo<T> dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "BinNo [ conteudo = " + conteudo + " ]";
	}
	
	

}

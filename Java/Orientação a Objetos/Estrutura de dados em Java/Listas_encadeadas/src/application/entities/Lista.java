package application.entities;

public class Lista<T> {
	
	private No<T> refEntradaLista;
	
	public Lista() {
		this.refEntradaLista = null;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.isEmpty()) {
			refEntradaLista = novoNo;
			return;
		}
		No<T> noAux = refEntradaLista;
		for (int i = 0; i < this.size() - 1; i++) {
			noAux = noAux.getProximoNo();
		}
		noAux.setProximoNo(novoNo);
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		validaIndice(index);
		No<T> noAux = refEntradaLista;
		No<T> noRetorno = null;
		for (int i = 0; i <= index; i++) { 
			noRetorno = noAux;
			noAux = noAux.getProximoNo();
		}
		return noRetorno;
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if (index == 0) {
			refEntradaLista = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		
		return noPivor.getConteudo();
	}
	
	// Tamanho da lista
	
	public int size() {
		int tamanhoLista = 0;
		No<T> refAux = refEntradaLista;
		
		while (true) {
			if (refAux != null) {
				tamanhoLista ++;
				if (refAux.getProximoNo() != null) {
					refAux = refAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	public void validaIndice(int index) {
		if (index >= size()) {
			int ultimoIndex = size() -1;
			throw new IndexOutOfBoundsException("N?o existe conte?do no indice " 
												+ index + " Dessa lista. Essa list? s? vai at? o indice " + ultimoIndex);
		}
	}
	
	public boolean isEmpty() {
		return refEntradaLista == null ? true : false;
	}
	
	@Override
	public String toString() {
		String str = "";
		No<T> noAux = refEntradaLista;
		for (int i = 0; i < this.size(); i++) {
			str += "[ No { conteudo = " + noAux.getConteudo() + " } ] --->";
			noAux = noAux.getProximoNo();
		}
		str += null;
		return str;
	}
	
}

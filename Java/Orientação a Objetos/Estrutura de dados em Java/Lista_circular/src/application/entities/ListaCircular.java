package application.entities;

public class ListaCircular<T> {
	
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cabeca = null;
		this.cauda = null;
		this.tamanhoLista = 0;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return tamanhoLista == 0 ? true : false;
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("A lista est? vazia.");
		}
		if (index == 0) {
			return cauda;
		}
		No<T> noAux = cauda;
		for (int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getProxNo();
		}
		return noAux;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if (isEmpty()) {
			cabeca = novoNo;
			cauda = cabeca;
			cabeca.setProxNo(cauda);
		}else {
			novoNo.setProxNo(cauda);
			cabeca.setProxNo(novoNo);
			cauda = novoNo;
		}
		tamanhoLista ++;
	}
	
	public void remove(int index) {
		if (index >= tamanhoLista) {
			throw new IndexOutOfBoundsException("O indice ? maior que o tamanho da lista.");
		}
		No<T> noAux = cauda;
		if (index == 0) {
			cauda = cauda.getProxNo();
			cabeca.setProxNo(cauda);
		}else if (index == 1) {
			cauda.setProxNo(cauda.getProxNo().getProxNo());
		}else {
			for (int i = 0; i < index - 1; i++) {
				noAux = noAux.getProxNo();
			}
			noAux.setProxNo(noAux.getProxNo().getProxNo());
		}
		tamanhoLista --;
	}

	@Override
	public String toString() {
		String str = "";
		
		No<T> aux = cauda;
		for(int i = 0; i < size(); i++) {
			str += "[ No { conta?do = " + aux.getConteudo() + "} ] -->";
			aux = aux.getProxNo();
		}
		
		str += size() != 0 ? "( Retorna ao in?cio )" : "[ ]";
		
		return str;
	}
	
	

}

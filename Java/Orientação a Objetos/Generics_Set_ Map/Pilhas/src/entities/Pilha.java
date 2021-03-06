package entities;

public class Pilha {
	
	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No top() { // Retorna o ?ltimo elemento adicionado na pilha
		return refNoEntradaPilha;
	}
	
	public void push(No novoNo) { // Adiciona um elemento na pilha
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No pop() { // Remove o ?ltimo elemento adicionado na pilha
		if (!isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false; // Essa linha ? a mesma coisa que um if e else...
	}

	@Override
	public String toString() {
		String retorno = "----------------------------\n";
		retorno += "   Pilhas\n";
		retorno += "----------------------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		while (true) {
			if (noAuxiliar != null) {
				retorno += "[ No {dado = " + noAuxiliar.getDado() + " } ]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		retorno += "----------------------------\n";
		return retorno;
	}
}

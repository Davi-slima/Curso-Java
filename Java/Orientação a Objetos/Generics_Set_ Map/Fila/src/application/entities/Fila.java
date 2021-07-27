package application.entities;

public class Fila<T> {
	
	private No<T> refEntradaFila;
	
	public Fila() {
		this.refEntradaFila = null;
	}
	
	public void enqueue(T obj) { // Adiciona um novo elemento no final da fila
		No<T> novoNo = new No<>(obj);
		novoNo.setRefNo(refEntradaFila);
		refEntradaFila = novoNo;
	}
	
	public T dequeue() { // Remove o primeiro elemento da fila
		if (!isEmpty()) {
			No<T> primeiroNo = refEntradaFila;
			No<T> noAuxiliar = refEntradaFila;
			
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObj();
		}
		return null;
	} 
	
	public T first() { // Retorna o primeiro elemento da fila
		if (!isEmpty()) {
			No<T> primeiroNo = refEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObj();
		}
		return null;
	}
	
	public boolean isEmpty() {
		return refEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String retorno = "";
		No<T> noAuxiliar = refEntradaFila;
		
		if (refEntradaFila != null) {
			while (true) {
				retorno += "[ { dado = " + noAuxiliar.getObj() + " } ] --->";
				if (noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo(); // Passa para o Próximo nó
				}else {
					retorno += "Null";
					break;
				}
			}
		}else {
			retorno += "Null";
		}
		
		return retorno;
	}
	
	

}

package application;

import application.entities.BinArvore;
import application.model.Obj;

public class Main {

	public static void main(String[] args) {
		
		BinArvore<Obj> minhaArvore = new BinArvore<>();
		
		minhaArvore.inserir(new Obj(13));
		minhaArvore.inserir(new Obj(10));
		minhaArvore.inserir(new Obj(25));
		minhaArvore.inserir(new Obj(2));
		minhaArvore.inserir(new Obj(12));
		minhaArvore.inserir(new Obj(20));
		minhaArvore.inserir(new Obj(31));
		minhaArvore.inserir(new Obj(29));
//		minhaArvore.inserir(new Obj(32));
		
		minhaArvore.exibirInOrdem();
//		minhaArvore.exibirPreOrdem();
//		minhaArvore.exibirPosOrdem();
		
		minhaArvore.remove(new Obj(10)); // O método remover não vai retornar nada, pois ele exclui o menor nó que está a esquerda da raiz
		minhaArvore.exibirInOrdem();
		
	}

}

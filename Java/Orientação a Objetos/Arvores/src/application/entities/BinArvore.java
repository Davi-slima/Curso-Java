package application.entities;

public class BinArvore<T extends Comparable<T>> {

	private BinNo<T> raiz;
	
	public BinArvore() {
		raiz = null;
	}
	
	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		raiz = inserir(raiz, novoNo);
	}
	
	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
		if (atual == null) {
			return novoNo;
		}else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { 	// compara se o conteudo do meu novo nó é maior que o nó atual
			atual.setEsq(inserir(atual.getEsq(), novoNo));
		}else {
			atual.setDir(inserir(atual.getDir(), novoNo));
		}
		return atual;
	}
	
	// Exibição em ordem
	
	public void exibirInOrdem() {
		System.out.print("\n Exibindo em ordem: ");
		exibirInOrdem(raiz);
	}
	
	private void exibirInOrdem(BinNo<T> atual) {
		if (atual != null) {
			exibirInOrdem(atual.getEsq());
			System.out.print(atual.getConteudo() + ", ");
			exibirInOrdem(atual.getDir());
		}
	}
	
	// exibir pós ordem
	
	public void exibirPosOrdem() {
		System.out.print("\n Exibindo Pos ordem: ");
		exibirPosOrdem(raiz);
	}
	
	private void exibirPosOrdem(BinNo<T> atual) {
		if (atual != null) {
			exibirPosOrdem(atual.getEsq());
			exibirPosOrdem(atual.getDir());
			System.out.print(atual.getConteudo() + ", ");
		}
	}
	
	// Exibir pré ordem
	
	public void exibirPreOrdem() {
		System.out.print("\n Exibindo pré ordem: ");
		exibirPreOrdem(raiz);
	}
	
	private void exibirPreOrdem(BinNo<T> atual) {
		if (atual != null) {
			System.out.print(atual.getConteudo() + ", ");
			exibirPreOrdem(atual.getEsq());
			exibirPreOrdem(atual.getDir());
		}
	}
	
	public void remove(T conteudo) {
		try {
			BinNo<T> atual = raiz;
			BinNo<T> pai = null;
			BinNo<T> filho = null;
			BinNo<T> temp = null;
			
			while (atual != null && !atual.getConteudo().equals(conteudo)) {
				pai = atual;
				if (conteudo.compareTo(atual.getConteudo()) < 0) { 		// Compara se o conteudo que quero removore é menor que o conteudo do nó
					atual = atual.getEsq();
				}else {
					atual = atual.getDir();
				}
			}
			
			if (atual == null) {
				System.out.println("Conteúdo não localizado.");
			}
			
			if (pai == null) {
				if (atual.getDir() == null) {
					raiz = atual.getEsq();
							
				}else if (atual.getEsq() == null) {
					raiz = atual.getDir();
				}else {
					for (temp = atual, filho = atual.getEsq();
							filho.getDir() != null;
							temp = filho, filho = filho.getEsq()
						){
						if (filho != atual.getEsq()) {
							temp.setDir(filho.getEsq());
							filho.setEsq(raiz.getEsq());
						}
					}
					filho.setDir(raiz.getDir());
					raiz = filho;
				}
				
			}else if (atual.getDir() == null) {
				if (pai.getEsq() == atual) {
					pai.setEsq(atual.getEsq());
				}else {
					pai.setDir(atual.getEsq());
				}
			}else if (atual.getEsq() == null) {
				if (pai.getEsq() == atual) {
					pai.setDir(atual.getDir());
				}else {
					pai.setDir(atual.getDir());
				}
			}else {
				for (temp = atual, filho = atual.getEsq();
						filho.getDir() != null;
						temp = filho, filho = filho.getDir()
						){
					if (filho != atual.getEsq()) {
						temp.setDir(filho.getEsq());
						filho.setEsq(atual.getEsq());
					}
					filho.setDir(atual.getDir());	
					if(pai.getEsq() == atual) {
						pai.setEsq(filho);
					}else {
						pai.setDir(filho);
					}
				}
			}
			
		}catch (NullPointerException e) {
			System.out.println("Conteúdo não encontrado.");
		}
	}
}

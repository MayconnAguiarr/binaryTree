package binaryTree;

public class No {

	private int valor;
	private No esquerda;
	private No direita;

	No(int valor) {
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}

	public static void montaArvore(No novo, No arvore) {
		if (arvore == null) {
			arvore = novo;
		} else {
			if (novo.valor < arvore.valor) {
				if (arvore.esquerda == null) {
					arvore.esquerda = novo;
				} else {
					montaArvore(novo, arvore.esquerda);
				}
			} else {
				if (arvore.direita == null) {
					arvore.direita = novo;
				} else {
					montaArvore(novo, arvore.direita);
				}
			}
		}
	}

	public static void imprimirPreOrdem(No n) {
		System.out.print(n.valor + " ");
		
		if (n.esquerda != null) {
			imprimirPreOrdem(n.esquerda);
		}
		if (n.direita != null) {
			imprimirPreOrdem(n.direita);
		}
	}

	public static void imprimirEmOrdem(No n) {
		if (n.esquerda != null) {
			imprimirEmOrdem(n.esquerda);
		}

		System.out.print(n.valor + " ");

		if (n.direita != null) {
			imprimirEmOrdem(n.direita);
		}
	}

	public static void imprimirPosOrdem(No n) {
		if (n.esquerda != null) {
			imprimirPosOrdem(n.esquerda);
		}

		if (n.direita != null) {
			imprimirPosOrdem(n.direita);
		}

		System.out.print(n.valor + " ");

	}

}

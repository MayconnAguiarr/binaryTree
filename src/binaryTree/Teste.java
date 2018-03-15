package binaryTree;

public class Teste {

	public static void main(String[] args) {

		No arvore =  new No(10);
		No.montaArvore(arvore, null);
		
		No n5 = new No(5);
		No.montaArvore(n5, arvore);

		No n20 = new No(20);
		No.montaArvore(n20, arvore);

		No n33 = new No(33);
		No.montaArvore(n33, arvore);
		
		No n1 = new No(1);
		No.montaArvore(n1, arvore);
		
		No n2 = new No(2);
		No.montaArvore(n2, arvore);

		No n7 = new No(7);
		No.montaArvore(n7, arvore);		
		
		No n30 = new No(30);
		No.montaArvore(n30, arvore);

		System.out.println("Pre-ordem");
		No.imprimirPreOrdem(arvore);
		System.out.println(" ");
		
		System.out.println("Em-ordem");
		No.imprimirEmOrdem(arvore);
		System.out.println(" ");

		System.out.println("Pos-ordem");
		No.imprimirPosOrdem(arvore);
		System.out.println(" ");		
		System.out.println();
		
		System.out.println("Nó 30 existe?");
		System.out.println(No.buscaNo(arvore, 30));
		
		System.out.println("Nó 45 não existente?");
		System.out.println(No.buscaNo(arvore, 45));

	}
}

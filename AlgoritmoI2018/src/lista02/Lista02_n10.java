package lista02;

import java.util.Scanner;

public class Lista02_n10 {

	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in); 
		int n1,n2,n3,n4,n5, soma=0;
		System.out.println("digite o primeiro n�mero:");
		n1 = insere.nextInt();
		System.out.println("digite o segundo n�mero:");
		n2 = insere.nextInt();
		System.out.println("digite o terceiro n�mero:");
		n3 = insere.nextInt();
		System.out.println("digite o quarto n�mero:");
		n4 = insere.nextInt();
		System.out.println("digite o quinto n�mero:");
		n5 = insere.nextInt();
		soma = n1+n2+n3+n4+n5;
		System.out.println("a soma � "+soma);
	}

}

package lista02;

import java.util.Scanner;

public class Lista02_n11 {

	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in); 
		double n1,n2,n3,n4,n5,n6, soma=0, media=0;
		System.out.println("digite o 1� n�mero:");
		n1 = insere.nextDouble();
		System.out.println("digite o 2� n�mero:");
		n2 = insere.nextDouble();
		System.out.println("digite o 3� n�mero:");
		n3 = insere.nextDouble();
		System.out.println("digite o 4� n�mero:");
		n4 = insere.nextDouble();
		System.out.println("digite o 5� n�mero:");
		n5 = insere.nextDouble();
		System.out.println("digite o 6� n�mero:");
		n6 = insere.nextDouble();
		soma = n1+n2+n3+n4+n5+n6;
		media = soma/6;
		System.out.println("a m�dia � "+media);
	}

}

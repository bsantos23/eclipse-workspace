package lista02;

import java.util.Scanner;

public class Lista02_n11 {

	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in); 
		double n1,n2,n3,n4,n5,n6, soma=0, media=0;
		System.out.println("digite o 1º número:");
		n1 = insere.nextDouble();
		System.out.println("digite o 2º número:");
		n2 = insere.nextDouble();
		System.out.println("digite o 3º número:");
		n3 = insere.nextDouble();
		System.out.println("digite o 4º número:");
		n4 = insere.nextDouble();
		System.out.println("digite o 5º número:");
		n5 = insere.nextDouble();
		System.out.println("digite o 6º número:");
		n6 = insere.nextDouble();
		soma = n1+n2+n3+n4+n5+n6;
		media = soma/6;
		System.out.println("a média é "+media);
	}

}

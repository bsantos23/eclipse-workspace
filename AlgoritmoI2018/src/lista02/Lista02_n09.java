package lista02;

import java.util.Scanner;

public class Lista02_n09 {

	public static void main(String[] args) {
		int numero;
		Scanner insere = new Scanner(System.in); 
		System.out.println("digite um número inteiro:");
		numero = insere.nextInt();
		System.out.print("seu sucessor é "+(numero+1));
	}

}

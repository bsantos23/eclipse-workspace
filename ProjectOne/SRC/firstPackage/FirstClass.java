package firstPackage;

import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 4;
		int y = 5;
		int soma = 0; 
		int multiplicacao = 0;
		
		System.out.println("Valor de X: " + x);
		System.out.println("Valor de Y: " + y);
		
		// Soma
		soma = x += y;
		
		// Imprime resultado da soma
		System.out.println("SOMA = " + soma);
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		// Multiplicacao
		multiplicacao = x *= y;

		// Imprime multiplicacao
		System.out.println("MULTIPLICACAO = " + multiplicacao);
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

}

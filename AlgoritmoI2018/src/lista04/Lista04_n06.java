package lista04;

/**
 * Programa: Calculadora de fatorial
 */

import java.util.Scanner;

public class Lista04_n06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int fatorial;
		double resultado = 1;
		
		System.out.println("DIGITE UM NUMERO INTEIRO NAO NEGATIVO: ");
		fatorial = entrada.nextInt();
		
		if(fatorial == 0) {

			System.out.println("\n>>> fact(" + fatorial + ") = " + " 1");

		} else {
		
			for(int x  = 1; x <= fatorial; x++) {
			
				resultado = resultado * x;
	
			}
			System.out.println("\n>>> fact(" + fatorial + ") = " + resultado);
		}
	}
}

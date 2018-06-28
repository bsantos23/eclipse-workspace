package lista04;

import java.util.Scanner;

public class Lista04_n08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valorA, valorB, primeiro, segundo, resultado = 0;

		System.out.println("VALOR DE A: ");
		valorA = entrada.nextInt();
		
		System.out.println("VALOR DE B: ");
		valorB = entrada.nextInt();
		
		if(valorA > valorB) {
			
			primeiro = valorA;
			segundo = valorB;
			
			//int x = valorB + 1;	// Soma 1 ao valorB para poder somar os valores entre o menor e o maior valor, o inverso é feito com o valorA no "for"
			
			for(int x = valorA; x >= valorB; valorB++) {
				resultado = resultado + valorB;		
			}
			
			System.out.println("\n>>> SOMA DE VALORES ENTRE A & B: " + resultado);
			
		} else {
			
			primeiro = valorB;
			segundo = valorA;

			for(int x = valorB; x >= valorA; valorA++) {
				resultado = resultado + valorA;		
			}
			
			System.out.println("\n>>> SOMA DE VALORES ENTRE B & A: " + resultado);
			
		}
	}
}

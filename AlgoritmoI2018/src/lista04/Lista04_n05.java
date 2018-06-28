package lista04;

import java.util.Scanner;

public class Lista04_n05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double altura;
		double primeiro = 0, segundo = 0;
			
		do {
			
			System.out.println("ALTURA: ");
			altura = entrada.nextDouble();
			
			if(altura == 0)
				break;
			
			if(altura > primeiro) {	
				primeiro = altura;
			} else {
				segundo = altura;
			}
			
			System.out.println("\n>>> PRIMEIRO LUGAR: " + primeiro);
			System.out.println("\n>>> SEGUNDO LUGAR: " + segundo);
			
		} while(altura != 0);
	}
}

package lista05;

import java.util.Scanner;

public class Lista05_n03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Especificando o tamanho do vetor
		int tamanhoDoVetor = 5;
		int x, i = 0;
		int[] valores = new int[tamanhoDoVetor];

		for(x = 0; x < tamanhoDoVetor; x++) {
			System.out.println("DIGITE O " + (x+1) + "º VALOR: ");
			valores[x] = input.nextInt();
		}
		
		while(x < tamanhoDoVetor) {
			tamanhoDoVetor++;
		}
		
		if(valores[i] %2 == 0)
			System.out.println("PARES: " + valores[i]);
	}
	
}

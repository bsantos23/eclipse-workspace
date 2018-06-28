package lista05;

import java.util.Scanner;

public class Prova_19_05_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int cont = 2;
		String marca[] = new String[cont];
		double tamanhoArmazenamento[] = new double[cont];
		double maiorArmazenamento = 0;
		int nomeDaMarca = 0;
		
		for(int m = 0; m < marca.length; ++m) {
			System.out.print("Marca: ");
			marca[m] = input.next().toUpperCase();
			
			System.out.print("Armazenamento em GB: ");
			tamanhoArmazenamento[m] = input.nextDouble();
			
			// Define a maior capacidade de armazenameto
			if(tamanhoArmazenamento[m] > maiorArmazenamento) {
				maiorArmazenamento = tamanhoArmazenamento[m];
				nomeDaMarca = m;
			}
			
		}
		
		System.out.println("\nMaior Armazenamento: " + maiorArmazenamento + " GB");
		System.out.println("Marca: " + marca[nomeDaMarca]);
	}
	
}

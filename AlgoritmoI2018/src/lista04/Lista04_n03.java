package lista04;

import java.util.Scanner;

public class Lista04_n03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 1;
		int cont = 0;
		int soma = 0;
		float media = 0f;
		
		while(numero != -1) {
			
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			
			if(numero == -1) {
				break;
			}
			
			soma += numero;
			
			cont++;
			
		}
		
		media = soma / cont;

		System.out.println("\nMEDIA DOS VALORES DIGITADOS ..... " + media);

	}

}

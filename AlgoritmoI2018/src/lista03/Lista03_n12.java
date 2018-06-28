package lista03;

import java.util.Scanner;

public class Lista03_n12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int idade;

		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();

		System.out.println("\nATENCAO: Menores de 5 anos nao sao classificados!\n");

		if(idade >= 5 && idade <= 7){

			System.out.println(">>> INFANTIL A");

		} else {

			if(idade >= 8 && idade <= 11){

				System.out.println(">>> INFANTIL B");

			} else {

				if(idade >= 12 && idade <= 13){

					System.out.println(">>> JUVENIL A");

				} else {

					if(idade >= 14 && idade <= 17){

						System.out.println(">>> JUVENIL B");

					} else {

						if(idade >= 18){

							System.out.println(">>> ADULTO");

						}

					}

				}

			}

		}

	}

}

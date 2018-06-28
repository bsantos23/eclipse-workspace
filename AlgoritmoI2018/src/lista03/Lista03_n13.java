package lista03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista03_n13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");

		double peso, altura, imc = 0;

		System.out.println("Altura em m: ");
		altura = entrada.nextDouble();

		System.out.println("Peso em Kg: ");
		peso = entrada.nextDouble();

		imc = peso / (altura * altura);
		
		String imcFormatado = df.format(imc);
		
		System.out.println("\nIMC .......... " + imcFormatado + "\n");

		if(imc < 20){

			System.out.println(">>> Abaixo do peso");

		} else {

			if(imc >=20 && imc < 25){

				System.out.println(">>> Normal");

			} else {

				if(imc >= 25 && imc < 35){

					System.out.println(">>> Excesso de peso");

				} else {

					if(imc >= 35 && imc < 50){

						System.out.println(">>> Obesidade");

					} else {

						if(imc >= 50){

							System.out.println(">>> Obesidade Morbida");

						}

					}

				}

			}

		}
		
	}

}

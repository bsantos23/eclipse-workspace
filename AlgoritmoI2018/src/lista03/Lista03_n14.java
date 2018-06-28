package lista03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista03_n14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//DecimalFormat formato = new DecimalFormat("0.#");
		
		double valorHoraAula = 0;
		double salarioBruto;
		double quantidadeSalarios;
		double salarioLiquido = 0;
		int numeroAulasMes = 0;
		double totalDescontos = 0;
		
		System.out.println("VALOR HORA AULA: ");
		valorHoraAula = entrada.nextDouble();
		
		System.out.println("NUMERO DE AULAS MES: ");
		numeroAulasMes = entrada.nextInt();

		// Calcula o valor do salario bruto
		salarioBruto = valorHoraAula * numeroAulasMes;

		// Calcula a quantidade de salarios minimos a partir do salario bruto
		quantidadeSalarios = salarioBruto / 954; // onde 954 e o valor do salario minimo atual
		
		//String novaQtSalarios = formato.format(quantidadeSalarios);

		// Checa faixa salarial para aplicacao de desconto do INSS
		if(salarioBruto <= 1693.72){

			salarioLiquido = (salarioBruto - ((salarioBruto * 8) / 100));
			totalDescontos = (salarioBruto * 8) / 100;

		} else {

			if(salarioBruto > 1693.72 && salarioBruto <= 2822.90){

				salarioLiquido = (salarioBruto - ((salarioBruto * 9) / 100));
				totalDescontos = (salarioBruto * 9) / 100;

			} else {

				if(salarioBruto > 2822.90){

					salarioLiquido = (salarioBruto - ((salarioBruto * 11) / 100));
					totalDescontos = (salarioBruto * 11) / 100;

				}

			}

		}
		
		System.out.println("\nTOTAL DE VENCIMENTOS .......... R$ " + salarioBruto);
		System.out.println("TOTAL DE DESCONTOS ............ R$ " + totalDescontos);
		System.out.println("LIQUIDO A RECEBER ............. R$ " + salarioLiquido + "\n");
		
		// Checa quantidade de salarios minimos recebidos
		if(quantidadeSalarios >= 10) {
			
			System.out.println(">>> Que Sortudo!");
			
		} else {
			
			if(quantidadeSalarios >= 6 && quantidadeSalarios <= 9) {
				
				System.out.println(">>> Um dia voce chega la!!!");
				
			} else {
				
				if(quantidadeSalarios < 6) {
					
					System.out.println(">>> Ah, coitado!!");
					
				}
				
			}
			
		}

	}

}

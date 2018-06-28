package lista03;

import java.util.Scanner;

public class Lista03_n18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorSalario, valorFinanciamento;
		
		System.out.println("Informe o valor bruto do salário: ");
		valorSalario = entrada.nextDouble();
		
		System.out.println("Valor do financiamento desejado: ");
		valorFinanciamento = entrada.nextDouble();
		
		double baseParaFinanciamento = valorSalario * 5;
		
		if(valorFinanciamento <= baseParaFinanciamento) {
			
			System.out.println(">>> Financiamento concedido!");
			
		} else {
			
			System.out.println(">>> Financiamento negado!");
			
		}
		
		System.out.println("==================================");
		System.out.println("Obrigado por nos consultar!");
		System.out.println("==================================");

	}

}

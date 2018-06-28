package lista03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista03_n19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatacao = new DecimalFormat("0.##");
		
		// dp = distancia percorrida
		// vm = velocidade media
		double dp1, dp2, tempo1, tempo2, vm1, vm2;
		
		System.out.println("============ Primeiro Veiculo ==============");
		System.out.println("Distancia total percorrida em Km/h: ");
		dp1 = entrada.nextDouble();
		
		System.out.println("Tempo gasto em horas: ");
		tempo1 = entrada.nextDouble();
		
		System.out.println("============= Segundo Veiculo ==============");
		System.out.println("Distancia percorrida em Km/h: ");
		dp2 = entrada.nextDouble();
		
		System.out.println("Tempo gasto em horas: ");
		tempo2 = entrada.nextDouble();
		
		vm1 = dp1 / tempo1;
		vm2 = dp2 / tempo2;
		
		String vmFormatada1 = formatacao.format(vm1); // Formata o valor de vm1 para 0.##
		String vmFormatada2 = formatacao.format(vm2); // Formata o valor de vm2 para 0.##
		
		System.out.println("======================== Resultados ===========================");
		System.out.println("Velocidade media do primeiro veiculo: " + vmFormatada1 + " Km/h");
		System.out.println("Velocidade media do segundo veiculo: " + vmFormatada2 + " Km/h");
		
	}

}

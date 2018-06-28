package lista03;

import java.util.Scanner;

public class Lista03_n17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioBruto;
		double parcelaEmprestimo;
		
		System.out.println("Valor do salario bruto: ");
		salarioBruto = entrada.nextDouble();
		
		System.out.println("Valor da parcela do emprestimo: ");
		parcelaEmprestimo = entrada.nextDouble();
		
		double percentualParcela = (salarioBruto * 30) / 100;
		
		System.out.println("Percentual da parcela: " + percentualParcela);
		
		if(parcelaEmprestimo <= percentualParcela) {
			
			System.out.println(">>> O emprestimo pode ser liberado");
			
		} else {
			
			System.out.println(">>> O emprestimo nao pode ser liberado");
			
		}
		
	}

}

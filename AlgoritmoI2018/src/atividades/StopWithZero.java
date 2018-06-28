package atividades;

import java.util.Scanner;

public class StopWithZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int k = 0, l = 0, m = 0;
		int option;
		int values[] = new int[5];
				
		System.out.print((m+1) + "º Valor: ");
		values[m] = input.nextInt();
		
		while(m < values.length && values[m] != 0)
		{
			m++;
			/**
			 * Mesmo que o valor do indice [m] seja diferente de 0 e
			 * o vetor n tenha chegado ao limite, o condicional if
			 * abaixo faz o teste condicional, e se m não for menor
			 * do que n, nada é feito e o laço é finalizado.
			 */
			if(m < values.length)
			{
				System.out.print((m+1) + "º Valor: ");
				values[m] = input.nextInt();
			}
		}
		
		if(m < values.length)
			m++;
		
		/**
		 * O while realiza o teste [l < m] para percorrer o
		 * vetor imprimindo os valores incluindo o zero digitado
		 */
		while(l < m)
		{
			System.out.print(values[l] + "\t");
			l++;
		}

	}

}

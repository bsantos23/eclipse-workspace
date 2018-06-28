package atividades;

import java.util.Scanner;

public class FinalizaComZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 5;
		int valores[] = new int[counter];
		/**
		 * "a" cresce dinamicamente enquanto o usuario informar 
		 * um valor diferente de 0 ou "a" for menor que o tamanho
		 * total do vetor.
		 */
		int a = 0;
		
		// Recebe o primeiro valor do usuario para teste
		System.out.print((a + 1) + "º VALOR: ");
		valores[a] = input.nextInt();

		// Enquanto o valor informado for diferente de 0, entra no laço
		while(a < valores.length && valores[a] != 0)
		{
			a++;
			
			if(a < valores.length)
			{
				System.out.print("VALOR: ");
				valores[a] = input.nextInt();
			}
			
		}
		
		// Se "a" for menor que o tamanho do vetor, incrementa + 1 ao valor de "a"
		if(a < valores.length)
		{
			a++;
		}
		
		for(int i = 0; i < a; i++)
		{
			System.out.println(valores[i]);
		}
	}

}

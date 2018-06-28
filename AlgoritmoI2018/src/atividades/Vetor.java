package atividades;

import java.util.*;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 5;
		int array[] = {1, 2, 3, 4, 5};
		int pos = 0;
		
		System.out.print(">>>> Ordem crescente <<<<\n");
		while(pos < array.length)
		{
			System.out.print(array[pos] + "\t");
			pos++;
		}
		
		System.out.println();
		
		int cont = array.length - 1;
		
		System.out.print("\n>>>> Ordem decrescente <<<<\n");
		while(cont >= 0)
		{
			System.out.print(array[cont] + "\t");
			cont--;
		}
		
		System.out.println("\n\n>>>> INFO:");
		System.out.println("Elementos: " + array.length + "\n"
				+ "Indices: " + array.length);
		
		int opcao, x = 0;
		boolean found = false;
		
		System.out.print("\nValor a ser pesquisado: ");
		opcao = input.nextInt();
		
		while(x < array.length && found != true)
		{
			if(array[x] == opcao)
			{
				System.out.println("\nValor " + opcao + " encontrado no indice " + x);
				found = true;
			}
			x++;
		}
		
		if(found == false)
			System.out.println("\nValor digitado não encontrado");
	}

}

package lista06;

import java.util.*;

public class Lista06_n01 {

	public static void main(String[] args) {
				
		/**
		 * Ao declarar uma matriz e passar os valores dos índices
		 * de forma manual, temos o seguinte problema:
		 * Ao percorrer as linhas e colunas da matriz e tentar
		 * imprimir os valores dos índices, a quantidade de valores impressos
		 * é igual ao tamanho do vetor.
		 * Ex: Um vetor de 3x4 serão impressos apenas os 3 primeiros valores da linha n.
		 */
		int[][] array = {{1, 3, 5, 7}, {2, 4, 6, 8}, {9, 3, 7, 11}};
	
		for(int l = 0; l < array.length; l++)
		{
			//System.out.print("L" + (l + 1) + " -> ");
			for(int c = 0; c < array[l].length; c++)
			{
				System.out.print(array[c][l] + "\t");
			}
			System.out.println();
		}
		
	}

}

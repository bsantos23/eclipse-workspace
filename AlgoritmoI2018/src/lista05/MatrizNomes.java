package lista05;

import java.util.Scanner;

public class MatrizNomes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Matriz 2x3 (duas linhas e 3 colunas)
		final int line = 2;
		final int column = 3;
		int cont = 1;
		String nome[][] = new String[line][column];
	
		// Percorre a matriz atribuindo aos indices, valores passados pelo usuarios
		for(int arr_line = 0; arr_line < line; arr_line++)
		{
			for(int arr_column = 0; arr_column < column; arr_column++)
			{
				System.out.print("Digite o " + (cont++) + "º nome: ");
				nome[arr_line][arr_column] = input.next().toLowerCase();
			}
		}
		
		// Percorre a matriz exibindo os valores
		for(int arr_line = 0; arr_line < line; arr_line++)
		{
			for(int arr_column = 0; arr_column < column; arr_column++)
			{
				System.out.print(nome[arr_line][arr_column] + "\n");
			}
		}
	}

}

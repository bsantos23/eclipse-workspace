package lista05;

import java.util.Scanner;

public class AgendaTel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final int line = 1;
		final int col = 2;
		
		// Instancia duas matrizes para armazenar os valores de nome e telefone
		String nome[][] = new String[line][col];
		String tel[][] = new String[line][col];
		
		// Entrada de dados pelo usuário
		for(int l = 0; l < line; l++)	// Contagem de LINHAS 
		{
			for(int c = 0; c < col; c++)	// Contagem de COLUNAS
			{
				System.out.print("Nome: ");
				nome[l][c] = input.next().toLowerCase(); 	// Preenchendo o vetor com o valor digitado
				
				System.out.print("Telefone: ");
				tel[l][c] = input.next();	// Preenchendo o vetor com o valor digitado
			}
		}
		
		// Pesquisa dos dados
		String search;
		boolean find = false;
		
		System.out.print("\nDigite um nome para pesquisar: ");
		search = input.next().toLowerCase();
		
		// Percorre a matriz por linha
		for(int l = 0; l < line; l++)
		{
			// Percorre a matriz por coluna
			for(int c = 0; c < col; c++)
			{
				// Compara o valor no index [l][c] com o valor passado pelo usuário
				if(nome[l][c].equals(search))
				{
					find = true;
					System.out.print("\n-----------------------------------------------");
					System.out.print("\nContato: " + search + "\nNumero: " + tel[l][c]);
					System.out.print("\nIdentificador do contato: " + l + " " + c);
					System.out.print("\n-----------------------------------------------");
				}
			}
		}
		
		System.out.println(nome.length);
		
	}

}

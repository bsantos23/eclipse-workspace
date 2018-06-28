package lista05;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int lin = 2;
		final int col = 3;
		
		// Declarar e instanciar a matriz
		int[][] mat = new int[lin][col];
		
		// Entrada de dados na matriz,
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++)
			{
				System.out.println("Digite um valor inteiro na posicao [" + i + "] [" + j + "]: ");
				mat[i][j] = scan.nextInt();
			}
		}
		
		// Outra forma
		
		int x;
		boolean achou = false;
		
		System.out.println("Digite um numero a ser procurado: ");
		x = scan.nextInt();
		
		for(int i = 0; (i < lin && !achou); i++)
		{
			for(int j = 0; (j < col && !achou); j++)
			{
				if(mat[i][j] == x)
				{
					achou = true;
				}
			}
		}
		
		if(achou)
		{
			System.out.println("O " + x + " esta na matriz.");
		} else {
			System.out.println("O " + x + " nao esta na matriz.");
		}
		
		// Exibe o conteudo da matriz
		/**for(int i = 0; i < lin; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.println(mat[i][j] + " ");
			}
		}
		*/
	}

}

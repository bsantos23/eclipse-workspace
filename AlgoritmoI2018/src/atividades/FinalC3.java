package atividades;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class FinalC3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/**
		 * Matriz de tamanho 4x2
		 */
		final int line = 3;
		final int column = 3;
		String gameInfo[][] = new String[line][column]; // Armazena nome e genero do jogo
		String gameName = null;
		String site[] = new String[2];
		int siteCounter = 0;
		int valueCounter = 0;
		double value[] = new double[gameInfo.length];
		
		// Input data
		System.out.println("+--------------------------------------------------+");
		System.out.println("+               CADASTRO DE JOGOS                  +");
		System.out.println("+--------------------------------------------------+");
		for(int i = 0; i < gameInfo.length; i++) // Percorre linhas
		{
			for(int j = 0; j < gameInfo[0].length; j++) // Percorre colunas
			{
				// Se o indice da coluna for igual 0, mostra "Titulo", se for 1, mostra "Genero"
				if(j == 0)
				{
					System.out.print("Titulo: ");
					gameInfo[i][j] = input.nextLine().toUpperCase();
					gameName = gameInfo[i][j]; // Recebe o nome do jogo
				} else {
					if(j == 1)
					{
						//Solicita ao usuario o genero do jogo, exibindo na tela o nome do jogo
						System.out.print("Genero: ");
						gameInfo[i][j] = input.nextLine().toUpperCase();
					} else {
						if(j == 2)
						{
							//Solicita ao usuario o site onde o jogo e vendido
							System.out.print("Site: ");
							gameInfo[i][j] = input.nextLine().toLowerCase();
						}
					}
					
				}
				
			}
			System.out.println(); //Quebra de linha
		}// End input data
		
		/**
		
		System.out.println("===================================================");
		System.out.println("===================================================\n");
		
		// Input site
		System.out.println("+--------------------------------------------------+");
		System.out.println("+                     SITES                        +");
		System.out.println("+--------------------------------------------------+");
		for(int i = 0; i < gameInfo.length; i++) //Percorre linhas
		{
			for(int j = 0; j < gameInfo[0].length; j++) //Percorre colunas
			{
				// Faz o index da coluna Titulo com o vetor site
				if(j == 0 && siteCounter < site.length)
				{	
					//Solicita ao usuario o site onde encontrar o jogo
					System.out.println("> " + gameInfo[i][j]);
					System.out.print("Site: ");
					site[siteCounter] = input.nextLine().toLowerCase();
					siteCounter++;
				}
				
			}
			System.out.println(); //Quebra de linha
		}// End input site
		
		*/
		
		System.out.println("===================================================");
		System.out.println("===================================================\n");
		
		// Input values
		System.out.println("+--------------------------------------------------+");
		System.out.println("+                     PRECOS                       +");
		System.out.println("+--------------------------------------------------+");
		for(int i = 0; i < gameInfo.length; i++) //Percorre linhas
		{
			for(int j = 0; j < gameInfo[0].length; j++) //Percorre colunas
			{
				//Indexa o vetor value a coluna "Titulo" da matriz gameInfo
				if(j == 0 && valueCounter < value.length)
				{
					//Solicita ao usuario a insercao do valor, mostrando o nome do jogo
					System.out.println("> " + gameInfo[i][j]);
					System.out.print("R$: ");
					value[valueCounter] = input.nextDouble();
					valueCounter++;
				}
				
			}
			System.out.println(); //Quebra de linha				
		}
		
		System.out.println("===================================================");
		System.out.println("===================================================\n");
		
		System.out.println("+--------------------------------------------------+");
		System.out.println("+                LISTA DE TITULOS                  +");
		System.out.println("+--------------------------------------------------+");
		for(int i = 0; i < gameInfo.length; i++) // Percorre linhas
		{
			for(int j = 0; j < gameInfo[0].length; j++) // Percorre colunas
			{
				// Se o indice da coluna for igual 0, mostra "Titulo", se for 1, mostra "Genero"
				if(j == 0)
				{
					System.out.print("Titulo: " + gameInfo[i][j] + "\n");
				} else {
					if(j == 1)
					{
						//Solicita ao usuario o genero do jogo, exibindo na tela o nome do jogo
						System.out.print("Genero: " + gameInfo[i][j] + "\n");
					} else {
						if(j == 2)
						{
							//Solicita ao usuario o site onde o jogo e vendido
							System.out.print("Site: " + gameInfo[i][j] + "\n");
						}
					}
					
				}
				
			}
			System.out.println(); //Quebra de linha
		}// End input data

	}

}

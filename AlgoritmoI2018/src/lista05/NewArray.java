package lista05;

public class NewArray {

	public static void main(String[] args) {

		// Declaração da matriz 3x3
		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int tArray[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		
		
		// Linhas
		for(int i = 0; i < tArray.length; i++)
		{
			// Colunas
			for(int j = 0; j < tArray[i].length; j++)
			{
				tArray[i][j] = matriz[j][i];
				//System.out.println(tArray[i][j]);
			}	
		}
		
		System.out.println("###### Matriz ######\n");
		
		// Linhas
		for(int k = 0; k < matriz.length; k++)
		{
			// Colunas
			for(int l = 0; l < matriz[k].length; l++)
			{
				System.out.print(matriz[k][l] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n###### Matriz Transposta ######\n");
		
		// Linhas
		for(int m = 0; m < tArray.length; m++)
		{
			// Colunas
			for(int n = 0; n < tArray[m].length; n++)
			{
				// Imprime os indices como n x m ao inves de m x n
				System.out.print(tArray[m][n] + "\t");
			}
			System.out.println();
		}
		
	}

}

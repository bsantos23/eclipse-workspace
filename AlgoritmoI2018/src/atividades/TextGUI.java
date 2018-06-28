package atividades;

public class TextGUI {

	// Imprime o grid da matriz
    public static void printBanner(int counter)
    {
        int inc = counter;
       
        /**
         * Os marcadores crescem dinamicamente de acordo
         * com o tamanho do vetor, em linhas e colunas.
         */
        for(int a = 0; a < inc; a++)
        {
            System.out.print("+");
            System.out.print("-----");
        }
       
        System.out.print("+\n");
    }// end function
 
    public static void main(String[] args) {
 
        int vetor[][] = {{1, 2, 4}, {5, 6, 8}, {5, 6, 7}};
        int counter = vetor[0].length;
 
        printBanner(vetor[0].length);
       
        for(int i = 0; i < vetor.length; i++)
        {
            for(int j = 0; j < vetor[i].length; j++)
            {  
                System.out.print("|  " + vetor[i][j] + "  ");
            }
           
            System.out.print("|");
            System.out.println();
           
            printBanner(vetor[0].length);
        }
       
    }

}

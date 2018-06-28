package lista05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TrabalhoPraNota {
		 
	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
	       
		int count = 5;
		int value[] = new int[count];
		int sum = 0, countMultiples = 0;
		double average = 0;
		char option = 0;
	    
		do
		{
			// Armazena o valor informado pelo usuario em cada indice percorrido
			for(int i = 0; i < value.length; i++)
			{
				System.out.print("Digite o " + (i+1) + "° numero: ");
				value[i] = input.nextInt();
	               
				// Armazena quantidade de valores multiplos de 3
				if((value[i] % 3) == 0)
					countMultiples += 1;
			}
	 
			if(countMultiples != 0)
			{
				for(int z = 0; z < value.length; z++)
				{
					if((value[z] % 3) == 0)
						sum = sum + value[z];
	            }
	 
				average = sum / countMultiples;
				String formattedValue = df.format(average);
	               
				System.out.println("\nA media dos numeros multiplos de 3 e " + formattedValue);
				//System.out.println("\nA media dos numeros multiplos de 3 e " + average);
			} else {
				System.out.println("\nNao foram encontrados valores multiplos de 3!");
			}
	   
			System.out.print("\nDeseja cadastrar mais " + count + " numeros? [s/n]: ");
			option = input.next().charAt(0);
			System.out.println("-------------------------------------------------------------");
	           
			// Zera os valores das variaveis se o usuario escolher a opcao 's'
			if(option == 's' && sum != 0 && average != 0)
			{
				sum = 0;
				average = 0;
				countMultiples = 0;
			}
		} while(option != 'n');
	}
}

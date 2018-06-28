package lista06;

import java.util.Scanner;

public class ExitWithZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int counter = 3;
		int values[] = new int[counter];
		int a = 0;
		
		System.out.print((a + 1) + " º Valor: ");
		values[a] = input.nextInt();
		
		while(a < values.length && values[a] != 0)
		{
			a++;
			
			if(a < values.length)
			{
				System.out.print((a + 1) + " º Valor: ");
				values[a] = input.nextInt();
			}
		}
		
		if(a < values.length)
			a++;

		for(int i = 0; i < a; i++)
		{
			System.out.print(values[i] + "\t");
		}

	}

}

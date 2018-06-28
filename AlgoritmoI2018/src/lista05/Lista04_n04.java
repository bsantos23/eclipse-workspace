package lista05;

public class Lista04_n04 {

	public static void main(String[] args) {
		
		int count = 10;
		int vetor[] = new int[count];
		
		System.out.println(count);
		
		for(int x = 0; x < vetor.length; x++)
		{
			System.out.println(vetor[x]);
		}
		
		while(count <= 0)
		{
			System.out.println(count);
			count--;
		}

	}

}

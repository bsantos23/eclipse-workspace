package lista04;

public class Lista04_n04 {

	public static void main(String[] args) {
		
		int x = 1;
		int resto = 0;
		int soma = 0;
		
		for(; x <= 200; x++) {
		
			resto = x % 3;
			
			soma = soma + resto;
			
		}
		
		System.out.println(">>> SOMA DOS RESTOS DE X mod 3: " + soma);

	}

}

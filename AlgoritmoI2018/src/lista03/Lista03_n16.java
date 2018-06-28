package lista03;

import java.util.Scanner;

public class Lista03_n16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com um valor inteiro: ");
		numero = entrada.nextInt();
		
		int resto1 = numero % 3;
		int resto2 = numero % 7;
		
		// checa se o numero digitado e divisivel por 3 e por 7
		if(resto1 == 0 && resto2 == 0) {
			
			System.out.println(">>> O valor " + numero + " e divisivel por 3 e por 7!");
			
		} else {
			
			// checa se o numero digitado e divisivel por 3
			if(resto1 == 0) {
				
				System.out.println(">>> O valor " + numero + " e divisivel por 3!");
				
			} else {
				
				// checa se o numero digitado e divisivel por 7
				if(resto2 == 0) {
					
					System.out.println(">>> O valor " + numero + " e divisivel por 7!");
					
				} else {
					
					System.out.println(">>> O valor " + numero + " nao e divisivel por 3 e nem por 7!!!");
					
				}
				
			}
			
		} 
		
	}

}

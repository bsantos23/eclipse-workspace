package lista03;

import java.util.Scanner;

public class Lista03_n20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media;
		int numFaltas;
		
		System.out.println("Media do aluno: ");
		media = entrada.nextDouble();
		
		System.out.println("Numero de faltas: ");
		numFaltas = entrada.nextInt();
		
		
		if(numFaltas >= 32){
			
			System.out.println("ALUNO REPROVADO POR QUANTIDADE DE FALTAS");
			
		}else{
			
			if(media < 7){
				
				System.out.println("ALUNO REPROVADO POR MEDIA INSUFICIENTE");
				
			} else {
				
				if(media >= 7) {	
					System.out.println("ALUNO APROVADO");		
				}
			}	
		}
	}
}

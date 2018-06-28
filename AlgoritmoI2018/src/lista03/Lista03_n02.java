package lista03;
import java.util.Scanner;
public class Lista03_n02 {
	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in);
		double numero;
		System.out.println("digite um número real:");
		numero = insere.nextDouble();
		if (numero == 1.5 || numero==10){
			System.out.println("o número é válido.");
		}else{
			System.out.println("o número não é válido.");
		}
		
	}
}

package lista02;
import java.util.Scanner;
public class Lista02_n19 {
	public static void main(String[] args) {
		double real, cotacao, dolar;
		Scanner insere = new Scanner (System.in);
		System.out.println("digite o valor em real:");
		real = insere.nextDouble();
		System.out.println("digite a cotação do dia:");
		cotacao = insere.nextDouble();
		dolar = real/cotacao;
		System.out.println("a quantidade de dolares para a "
				+ "viagem é "+dolar);
	}
}

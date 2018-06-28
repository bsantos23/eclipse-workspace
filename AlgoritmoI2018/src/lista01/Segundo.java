package lista01;
import java.util.Scanner;
public class Segundo {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner insere = new Scanner(System.in);
		System.out.println("digite o primeiro número:");
		a = insere.nextInt();
		System.out.println("digite o segundo número:");
		b = insere.nextInt();
		c = a + b;
		System.out.println("a soma é "+c);
	}

}

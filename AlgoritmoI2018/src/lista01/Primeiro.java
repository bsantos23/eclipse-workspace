package lista01;
import java.util.Scanner;
public class Primeiro {
	public static void main(String[] args) {
		String frase;
		int num;
		Scanner insere = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		frase = insere.next();
		System.out.print("Agora digite um n�mero: ");
		num = Integer.parseInt(insere.next());
		System.out.println("Ol� " + frase+", o n�mero digitado foi "+ num);
	}
}

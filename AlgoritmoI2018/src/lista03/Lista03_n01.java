package lista03;

import java.util.Scanner;
public class Lista03_n01 {
	public static void main(String[] args) {
		short idade;
		Scanner insere = new Scanner(System.in);
		System.out.print("digite a idade:");
		idade = insere.nextShort();
		if (idade>=10 && idade <=18){
			System.out.println("a idade está dentro"
					+ " do intervalo.");
		}else{
			System.out.println("a idade não está no"
					+ " intervalo desejado.");
		}
		System.exit(0);
	}
}

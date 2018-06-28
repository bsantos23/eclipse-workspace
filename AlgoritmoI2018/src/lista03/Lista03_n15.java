package lista03;
import java.util.Scanner;
public class Lista03_n15 {
	public static void main(String[] args) {
		Scanner insere = new Scanner (System.in);
		int lado1, lado2, lado3;
		
		System.out.println("digite um lado do triangulo:");
		lado1 = insere.nextInt();
		System.out.println("digite um outro lado do triangulo:");
		lado2 = insere.nextInt();
		System.out.println("digite um outro lado do triangulo:");
		lado3 = insere.nextInt();
		
		if (lado1==0 || lado2==0 || lado3==0){
			System.out.println("não é um triangulo.");
		}else{
			if (lado3>(lado1+lado2) || lado1>(lado2+lado3) ||
					lado2>(lado1+lado3)){
				System.out.println("não é um triangulo.");
			}else{
				if (lado1==lado2 && lado2==lado3){
					System.out.println("triangulo equilátero.");
				}else{
					if (lado1!=lado2 && lado2!=lado3){
						System.out.println("triangulo escaleno.");
					}else{
						System.out.println("triangulo isoceles.");
					}
				}
			}
		}
	}
}

package lista03;
import java.util.Scanner;
public class Lista03_n11 {
	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in);
		double salario;
		System.out.println("digite o salario atual:");
		salario = insere.nextDouble();
		if (salario<500){
			salario = salario * 1.15; 
		}else{
			if (salario>=500 && salario<=1000){
				salario = salario * 1.10;
			}else{
				salario = salario * 1.05;
			}
		}
		System.out.println("o novo salario é "+salario);
	}
}

package lista03;
import java.util.Scanner;
public class Lista03_n03 {
	public static void main(String[] args) {
		Scanner insere = new Scanner(System.in);
		int pont1, pont2, pont3;
		System.out.println("digite  a 1� pontua��o:");
		pont1 = insere.nextInt();
		System.out.println("digite  a 2� pontua��o:");
		pont2 = insere.nextInt();
		System.out.println("digite  a 3� pontua��o:");
		pont3 = insere.nextInt();
		if (pont1>pont2 && pont2>pont3){
			System.out.println("1� lugar � "+pont1+"\n"
					+ "2� lugar � "+pont2+"\n"
					+ "3� lugar � "+pont3);
		}else{
			if (pont2>pont1 && pont1>pont3){
				System.out.println("1� lugar � "+pont2+"\n"
						+ "2� lugar � "+pont1+"\n"
						+ "3� lugar � "+pont3);
			}else{
				if (pont1>pont3 && pont3>pont2){
					System.out.println("1� lugar � "+pont1+"\n"
							+ "2� lugar � "+pont3+"\n"
							+ "3� lugar � "+pont2);
				}else{
					if(pont2>pont3 && pont3>pont1){
						System.out.println("1� lugar � "+pont2+"\n"
								+ "2� lugar � "+pont3+"\n"
								+ "3� lugar � "+pont1);
					}else{
						if (pont3>pont1 && pont1>pont2){
							System.out.println("1� lugar � "+pont3+"\n"
									+ "2� lugar � "+pont1+"\n"
									+ "3� lugar � "+pont2);
						}else{
							if (pont3>pont2 && pont2>pont1){
								System.out.println("1� lugar � "+pont3+"\n"
										+ "2� lugar � "+pont2+"\n"
										+ "3� lugar � "+pont1);
							}else{
								System.out.println("houve empate");
							}
						}
					}
				}
			}
		}
	}
}

package lista03;
import java.util.Scanner;
public class Lista03_n06 {
	public static void main(String[] args) {
		String estado;
		Scanner insere = new Scanner (System.in);
		System.out.println("digite o nome do estado:");
		estado = insere.nextLine();
		if (estado.equals("RS")||estado.equals("PR")
				|| estado.equals("SC")){
			System.out.println("regiao sul");
		}else{
			if (estado.equals("SP")|| estado.equals("RJ")
					|| estado.equals("ES")||estado.equals("MG")){
				System.out.println("regiao sudeste");
			}else{
				if (estado.equals("MT")|| estado.equals("GO")
						|| estado.equals("MS")||estado.equals("DF")){
					System.out.println("regiao centro-oeste");
				}else{
					if (estado.equals("AM")|| estado.equals("PA")
							|| estado.equals("AC")||estado.equals("RR")
							||estado.equals("AP")||estado.equals("TO")
							||estado.equals("RO")){
						System.out.println("regiao norte");
					}else{
						System.out.println("regiao nordeste");{
						}
					}
				}
			}
		}
	}
}
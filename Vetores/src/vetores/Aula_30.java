package vetores;

public class Aula_30 {

	public static void main(String[] args) {
		
		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];
		
		notaAlunos[0] = 6.5;
		notaAlunos[1] = 5.5;
		notaAlunos[2] = 7.5;
		
		for(int i = 0; i < notaAlunos.length; i++) {
			
			System.out.println(notaAlunos[i]);
			
		}
		
		System.out.println("Tamanho do Vetor: " + notaAlunos.length);

	}

}

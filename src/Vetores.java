import java.util.Locale;
import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		/*
		 * Checklist
		 * 	Revisão ddo conteito vetor
		 * 	Declaração e instanciação
		 * 	Manipulação de vetor de elementos tipo valor(tipo primitico)
		 * 	Manipulação de vetor elemetos tipos referencias(classe)
		 * Acesso aos elementos 
		 * Propriedad length
		 * 
		 * 
		 * vetor=> arranjos unidimensionais
		 * 		array é uma estrutura de dados
		 * 		 homogenea, ordenada, alocada de uma vez só
		 * 
		 * 
		 */
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vecto = new double[n];
		
		for(int i=0; i<n; i++) {
			vecto[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vecto[i];
		}
		
		double avg = sum/n;
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		sc.close();
	}
}

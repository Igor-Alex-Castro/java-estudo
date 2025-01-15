package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantNumero = scanner.nextInt();
		
		double[] vetor = new double[quantNumero];
		double media = 0.0;
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextDouble();
			soma += vetor[i];
		}
		
		media = soma/vetor.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f \n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for ( double v : vetor) {
			if(v < media) {
				System.out.println(v);
			}
		}
		
	}
}

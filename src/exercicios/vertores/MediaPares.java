package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantNumero = scanner.nextInt();
		
		int[] vetor = new int[quantNumero];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: " );
			vetor[i] = scanner.nextInt();
		}
		
		double somaPar = 0.0;
		double quantPar = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] %2 == 0) {
				somaPar += vetor[i];
				quantPar += 1;
			}
		}
		
		double mediaPar = somaPar/quantPar;
		
		if(quantPar > 0) {
			System.out.printf("MEDIA DOS PARES: %.1f", mediaPar );
		}else {
			System.out.printf("NENHUM NUMERO PAR");
		}
		
		
		
		
	}
}

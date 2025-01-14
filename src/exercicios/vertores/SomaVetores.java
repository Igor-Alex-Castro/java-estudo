package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantNumero = scanner.nextInt();
		int[] vetorA = new int[quantNumero];
		int[] vetorB = new int[quantNumero];
		int[] vetorC = new int[quantNumero];
		
		System.out.println("Digite os valores do vetor A? ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scanner.nextInt();
		}
		System.out.println("Digite os valores do vetor A? ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = scanner.nextInt();
		}
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
	}
}
	

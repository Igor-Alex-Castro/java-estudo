package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int quantNumeros = scanner.nextInt();
		
		double[] vetorNumeros = new double[quantNumeros];
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Digite um numero: ");
			vetorNumeros[i] = scanner.nextDouble();
		}
		
		int maiorPos = 0;
		double maiorValor = vetorNumeros[0];
		for (int i = 0; i < vetorNumeros.length; i++) {
			/*
			 * 0
			 */
			if(vetorNumeros[i] > maiorValor) {
				maiorValor = vetorNumeros[i];
				maiorPos = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + maiorPos);
	}
}

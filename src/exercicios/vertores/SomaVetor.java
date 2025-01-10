package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int number = scanner.nextInt();
		
		double[] vetNumber = new double[number];
		
		for (int i = 0; i < vetNumber.length; i++) {
			System.out.print("Digite um numero: ");
			vetNumber[i] = scanner.nextDouble();
		}
		
		System.out.print ("VALORES = ");
		for (int i = 0; i < vetNumber.length; i++) {
		
		   System.out.printf ("%.1f ", vetNumber[i]);
		   
		}
		System.out.println();
		
		double soma = 0.0;
		System.out.print("SOMA = ");
		for (int i = 0; i < vetNumber.length; i++) {
		
		   soma += vetNumber[i];
		   
		}
		System.out.printf("%.1f\n", soma);
		
		double media = soma/vetNumber.length;
		System.out.printf("MEDIA = %.1f\n", media);
		
	}
}

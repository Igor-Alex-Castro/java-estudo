package exercicios.vertores;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int number = scanner.nextInt();
		
		
		while(number > 10) {
			System.out.println("O número deve estar ente 0 e 10, digite novamente!");
			System.out.print("Quantos numeros voce vai digitar? ");
			number = scanner.nextInt();
		}
		
		int[] vetNumber = new int[number];
		
		for (int i = 0; i < vetNumber.length; i++) {
			System.out.print("Digite um numero: ");
			vetNumber[i] = scanner.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < vetNumber.length; i++) {
			if(vetNumber[i] < 0) {
				System.out.println(vetNumber[i]);
			}
			
		}
		
		
		
	}
}

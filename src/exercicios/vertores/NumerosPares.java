package exercicios.vertores;

import java.util.Scanner;

public class NumerosPares {
		public static void main(String[] args) {
			
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Quantos numeros você vai digitar? ");
			int quantNumero = scanner.nextInt();
			
			int[] vetorNumeros = new int[quantNumero];
			
			for (int i = 0; i < vetorNumeros.length ; i++) {
				
				System.out.print("Digite um numero: ");
				vetorNumeros[i] = scanner.nextInt();
			}
				
			int contPares = 0;
			
			System.out.println();
			System.out.println("NUMEROS PARES: ");
			for (int i = 0; i < vetorNumeros.length; i++) {
				if(vetorNumeros[i] % 2 == 0) {
					System.out.print(vetorNumeros[i] + " ");
					contPares += 1;
				}
			}
			
			System.out.println();
			System.out.println();
			System.out.println("QUANTIDADE DE PARES =  " + contPares);
		}

}

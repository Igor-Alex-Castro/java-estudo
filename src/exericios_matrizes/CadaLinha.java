package exericios_matrizes;

import java.util.Scanner;

public class CadaLinha {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz: ");
		int ordem = scanner.nextInt();
		
		int[][] matriz = new int[ordem][ordem];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (int i = 0; i < matriz.length; i++) {
			int maior = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] > maior ) {
					maior = matriz[i][j];
				}
			}
			
			System.out.println(maior);
		}
	}
}	

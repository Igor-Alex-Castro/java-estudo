package exericios_matrizes;

import java.util.Scanner;

public class somaMatriezes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int linha = scanner.nextInt();
		
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int col = scanner.nextInt();
		
		int[][] matrizA = new int[linha][col];
		int[][] matrizB = new int[linha][col];
		int[][] matrizC = new int[linha][col];
		
		System.out.println("Digite os valores da matriz A:");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matrizA[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matrizB[i][j] = scanner.nextInt();
				matrizC[i][j] = matrizB[i][j] + matrizA[i][j];
			}
		}
		
		System.out.println("MATRIZ SOMA: ");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
			
				System.out.print(matrizC[i][j] + " ") ;
			}
			System.out.println();
		}
	}
}

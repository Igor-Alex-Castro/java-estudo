package exericios_matrizes;

import java.util.Scanner;

public class negativosMatriz {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linhas = scanner.nextInt();
		
		System.out.print("Qual a quantidade de colunas da matriz?");
		int col =  scanner.nextInt();
		
		int[][] matriz = new int[linhas][col];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento " + "[" + i + "," + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println("VALORES NEGATIVOS: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] < 0) {
					System.out.println(matriz[i][j]);
				}
				
			}
		}
	}
}

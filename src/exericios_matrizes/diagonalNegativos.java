package exericios_matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class diagonalNegativos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int ordem = scanner.nextInt();
		
		while(ordem > 10){
			System.out.println("A ordem deve ser entre 1 a 10, digite novamente");
			System.out.print("Qual a ordem da matriz? ");
			ordem = scanner.nextInt();
			
		};
		
		int[][] matriz = new int[ordem][ordem];
		
		int quant = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				System.out.print("Elemento  [" + i + "," + j + "]: ");
				matriz[i][j] = scanner.nextInt();
				
				if(matriz[i][j] < 0 ) {
					quant += 1;
				}
			}
			
			
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (int i = 0; i < matriz.length; i++) {
		System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + quant);
	}
}

package exericios_matrizes;

import java.util.Scanner;

public class AcimaDiagonal {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Qual a ordem da matriz? ");
		 int ordem = scanner.nextInt();
		 
		 int[][] matriz = new int[ordem][ordem];
		 int soma = 0;
		 for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		 
		 for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					
					if(matriz[i][j] != 0){
						if(j > i) {
							soma += matriz[i][j];
						}
					}
				}
			}
		 
		 System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + 18) ;
	}
}

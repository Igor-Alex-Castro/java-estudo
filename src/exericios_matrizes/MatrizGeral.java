package exericios_matrizes;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.ObjLongConsumer;

public class MatrizGeral {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual a ordem da matriz? ");
		int ordem = scanner.nextInt();
		
		Double[][] matriz = new Double[ordem][ordem];
		double soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matriz[i][j] = scanner.nextDouble();
				
				if(matriz[i][j] >= 0) {
					soma += matriz[i][j];
				}
			}
		}
		
		
		  System.out.printf("\nSOMA DOS POSITIVOS: %.1f \n\n", soma);
		 
		  System.out.print("Escolha uma linha: "); 
		  int linha = scanner.nextInt();
		  
		  
		  System.out.print("LINHA ESCOLHIDA: "); 
		  for (int j = 0; j < matriz[linha].length; j++) {
			  System.out.printf("%.1f ", matriz[linha][j] );
		  }
		 
		  System.out.print("\n\nEscolha uma coluna: "); 
		  int col = scanner.nextInt();
		  
		  System.out.print("COLUNA ESCOLHIDA: "); 
		  for (int i = 0; i < matriz.length;i++) {
			  System.out.printf("%.1f ", matriz[i][col] );
		  }
		 
		  System.out.printf("\n\nDIAGONAL PRINCIPAL: ");
		  
		  for (int i = 0; i < matriz.length; i++) { 
			  System.out.printf("%.1f ",matriz[i][i] ); 
		}
		 
		
		System.out.println("\n\nMATRIZ ALTERADA:");
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
					System.out.print(matriz[i][j] + " ");
				}else {
					System.out.print(matriz[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
	}
}

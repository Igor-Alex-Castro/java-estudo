package exericios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class somaLinhas {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = scanner.nextInt();
		
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int col  = scanner.nextInt();
		
		Double[][] matriz = new Double[linha][col];
		
	    Double[] vetor = new Double[linha];
	    
		for (int i = 0; i < matriz.length ; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha: ");
			for (int j = 0; j <  matriz[i].length ; j++) {
				matriz[i][j] = scanner.nextDouble();
				
			}
		}
		
		Double soma = 0.0;
		System.out.println("VETOR GERADO:" );
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j <  matriz[i].length ; j++) {
				soma +=  matriz[i][j];
				vetor[i] = soma ;
			}
			soma = 0.0;
			System.out.printf("%.1f \n", vetor[i]);
		}
	}
}

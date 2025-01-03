package exercicios.estrutura.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class quadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		int X,Y;
		
		do {
			
			System.out.println("Digite os valores das coordenadas X e Y: ");
			X = scanner.nextInt();
			Y = scanner.nextInt();
			
			if(X > 0 && Y > 0) {
				System.out.println("QUADRANTE Q1");
			}else if(X < 0 && Y > 0) {
				System.out.println("QUADRANTE Q2");
			}else if(X < 0 && Y < 0){
				System.out.println("QUADRANTE Q3");
			}else if(X > 0 && Y < 0) {
				System.out.println("QUADRANTE Q4");
			}
				
		}while( X != 0 && Y != 0);
		
		
	}
}

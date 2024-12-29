package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02_Retangulo {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double baseRet;
		double alturaRet;
		double area;
		double perimetro;
		double diagonal;
		
		final int BASE_POTENCIA = 2;
		
		System.out.print("Base retangulo: ");
		baseRet = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		alturaRet = sc.nextDouble();
		
		area = baseRet*alturaRet;
		perimetro = alturaRet*2 + baseRet*2;
		
		diagonal = 
				Math.sqrt(
						Math.pow(baseRet, BASE_POTENCIA) + Math.pow(alturaRet, BASE_POTENCIA)
				);
		
		System.out.printf("AREA = %.4f%n", area );
		System.out.printf("PERIMETRO = %.4f%n", perimetro );
		System.out.printf("DIAGONAL = %.4f%n ", diagonal);
		
		
	}	
}
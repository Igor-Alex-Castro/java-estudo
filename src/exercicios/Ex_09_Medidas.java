package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_09_Medidas {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

	 
	 
	 double medidaA;
	 double medidaB;
	 double medidaC;
	 
	 double areaQuadrado;
	 
	 double areaTriangulo;
	 
	 double areaTrapezio;
	 System.out.println("Digite a medida A: ");
	 medidaA = sc.nextDouble();
	 
	 System.out.println("Digite a medida B: ");
	 medidaB = sc.nextDouble();
	 
	 System.out.println("Digite a medida C: ");
	 medidaC = sc.nextDouble(); 
	 
	 
	 areaQuadrado = medidaA*4;
	 
	 areaTriangulo = (medidaA*medidaB)/2;
	 
	 areaTrapezio = ((medidaA + medidaB)*medidaC)/2;
	 
	 System.out.printf("AREA DO QUADRADO: %.4f\n", areaQuadrado);
	 System.out.printf("AREA DO TRIANGULO: %.4f\n", areaTriangulo);
	 System.out.printf("AREA DO TRAPEZIO: %.4f\n", areaTrapezio);
	}	
}


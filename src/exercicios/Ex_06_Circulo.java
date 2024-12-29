package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06_Circulo {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

	 final int baseDois = 2;
	
	 double raio;
	 
	 double areaCirculo;
	 
	 
	 System.out.print("Digite o valor do raio do circulo: ");
	 raio = sc.nextDouble();
	 
	 areaCirculo = Math.PI *(Math.pow(raio, baseDois));
	 
	 System.out.printf("AREA  = %.3f", areaCirculo );
	 
	}	
}


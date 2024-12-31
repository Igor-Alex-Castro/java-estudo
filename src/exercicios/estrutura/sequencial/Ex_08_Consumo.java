package exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08_Consumo {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
;

	 int distanciaPercorrida;
	 double combustivelGasto;
	 
	 double consumoMedio;
	 
	 System.out.print("Distancia percorreida: ");
	 distanciaPercorrida = sc.nextInt();
	 
	 System.out.print("Combustível gasto: ");
	 combustivelGasto = sc.nextDouble();
	 
	 consumoMedio = distanciaPercorrida/combustivelGasto;
	 
	 System.out.printf("Consumo medio = %.3f", consumoMedio );
	}	
}


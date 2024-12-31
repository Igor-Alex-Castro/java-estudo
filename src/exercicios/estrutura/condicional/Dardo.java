package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   double lancamento1;
	   double lancamento2;
	   double lancamento3;
	   
	   System.out.println("Digite as tres distancias: ");
		
	   lancamento1 = sc.nextDouble();
	   lancamento2 = sc.nextDouble();
	   lancamento3 = sc.nextDouble();
	   
	   if(lancamento1 >= lancamento2 && lancamento1 >= lancamento3) {
		   System.out.printf("MAIOR DISTANCIA = %.2f", lancamento1);
	   }else {
		   if(lancamento2 > lancamento3) {
			   System.out.printf("MAIOR DISTANCIA = %.2f", lancamento2);
		   }else {
			   System.out.printf("MAIOR DISTANCIA = %.2f", lancamento3);
		   }
	   }
	}
}

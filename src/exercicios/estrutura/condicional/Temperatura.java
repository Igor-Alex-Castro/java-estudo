package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   char tempEscala;
	   double valorTemp;
	
	   System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
	   tempEscala = sc.next().charAt(0);
	   
	  
	   if(tempEscala == 'F' ) {
		   System.out.print("Digite a temperatura em Fahrenheit: ");
		   valorTemp = sc.nextDouble();
		    valorTemp = (5.0/9.0)*(valorTemp - 32);
		   System.out.printf("Temperatura equivalente em Celsius: %.2f ", valorTemp);
		   
	   }else {
		   
		   System.out.print("Digite a temperatura em Celsius: ");
		   valorTemp = sc.nextDouble();
		   valorTemp = (9.0/5.0)*valorTemp + 32  ;
		   System.out.printf("Temperatura equivalente em Fahrenheit: %.2f ", valorTemp );
	   }
	   
	   
	}
}

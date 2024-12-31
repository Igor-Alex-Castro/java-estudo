package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   double coeficienteA = 0;
	   double coeficienteB = 0;
	   double coeficienteC = 0;
	   double delta;
	   double valorXmenos;
	   double valorXmais;
	   
	   
	   
	    System.out.print("Coeficiente a: ");
	    coeficienteA = sc.nextDouble();
	    
	    System.out.print("Coeficiente b: ");
	    coeficienteB = sc.nextDouble();
	    
	    System.out.print("Coeficiente c: ");
	    coeficienteC = sc.nextDouble();
	    
	    delta = (coeficienteB*coeficienteB) - (4*coeficienteA*coeficienteC);
	  
	    valorXmenos  = ((-1*coeficienteB) - Math.sqrt(delta))/(2*coeficienteA);
	    valorXmais = ((-1*coeficienteB) +  Math.sqrt(delta))/(2*coeficienteA);
	    
	    if(delta < 0) {
	    	System.out.println("Esta equacao nao possui raizes reais");
	    }else {
	 	    System.out.printf("X1 = %.4f \n", valorXmais  );
	 	    System.out.printf("X2 = %.4f \n", valorXmenos);
	    }
	   
	}
}

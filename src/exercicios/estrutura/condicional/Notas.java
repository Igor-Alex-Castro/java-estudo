package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   double nota1;
	   double nota2;
	   double notaFinal;
	   final double MEDIA = 60.00; 
	   
	    System.out.print("Digite a primeira nota:");
	    nota1 = sc.nextDouble();
	    
	    System.out.print("Digite a segunda nota:");
	    nota2 = sc.nextDouble();
	    
	    notaFinal = nota1 + nota2;
	    
	    System.out.printf("NOTA FINAL = %.1f \n", notaFinal);
	    
	    if(notaFinal < MEDIA) {
	    	System.out.println("REPROVADO");
	    }
	   
	}
}

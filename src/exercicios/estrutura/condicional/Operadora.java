package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	  int minutos;
	  int minutosExcedido;
	  double valorFinal;
	  final double valorPlanoInicial = 50.00;
	  System.out.print("Digite a quantidade de minutos: ");
	  minutos = sc.nextInt();
	  
	  valorFinal = valorPlanoInicial;
	  
	  if(minutos <= 100) {
		  System.out.printf("Valor a pagar: R$ %.2f",  valorFinal);
	  }else {
		  minutosExcedido = minutos -100;
		  valorFinal = valorFinal +  (minutosExcedido*2);
		  System.out.printf("Valor a pagar: R$ %.2f", valorFinal);
	  }
	}
}

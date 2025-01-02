package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class tempoDeJogo {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
		
	   int horaInicial;
	   int horaFinal;
	   int duracaoJogo;
	   
	   System.out.print("Hora inicial: ");
	   horaInicial = sc.nextInt();
	   
	   System.out.print("Hora final: ");
	   horaFinal =  sc.nextInt();
	   
	   if(horaFinal > horaInicial) {
		   duracaoJogo = horaFinal - horaInicial;
		   System.out.println("O JOGO DUROU " + duracaoJogo  + " HORA(S)");
		   
	   }else if( horaInicial > horaFinal) {
		   
		   duracaoJogo = (24 - horaInicial) + horaFinal;
		   System.out.println("O JOGO DUROU " + duracaoJogo  + " HORA(S)");
		   
	   }else if (  horaInicial == horaFinal ) {
		   
		   System.out.println("O JOGO DUROU 24 HORA(S)");
	   }
	   
	}
}

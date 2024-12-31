package exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_10_Duracao {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int duracaoSegundos;
		
		double segundos;
		
		double min;
		
		double  horas;
		
		System.out.print("Digite a duracao em segundos: ");
		duracaoSegundos = sc.nextInt();
		
		horas = duracaoSegundos/3600;
		min = (duracaoSegundos%3600)/60;
		segundos = duracaoSegundos - (horas*3600) - min*60;
		
		
		
		
		System.out.printf("%.0f:%.0f:%.0f", horas, min, segundos);
	 
	 
	}	
}


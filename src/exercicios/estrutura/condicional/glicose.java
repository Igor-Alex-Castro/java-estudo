package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class glicose {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double quantGlicose;
		
		final int CLASSIFICAO_GLI_100 =  100 ;
		
		final int CLASSIFICAO_GLI_140 =  140 ;
		

		
		System.out.print("Digite a medida da glicose: ");
		quantGlicose = sc.nextDouble();
		
		if(quantGlicose <= CLASSIFICAO_GLI_100) {
			System.out.println("Classificacao: normal");
		}else if(quantGlicose  > 100 && quantGlicose <= CLASSIFICAO_GLI_140  ) {
			System.out.println("Classificacao: elevado");
		}else {
			System.out.println("Classificacao: diabetes");
		}
		
	}
}

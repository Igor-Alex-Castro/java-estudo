package exercicios.estrutura.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class mediaIdades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		int soma = 0;
		
		double mediaIdades =  0;
		int cont = 0;
		System.out.println("Digite as idades: ");
		do {
				
			idade = scanner.nextInt();
			
			if(idade> 0) {
				soma += idade;
				cont++;
			}
			
			
			
		} while(idade > 0 );
		
		mediaIdades = (double) soma/cont; //estudar casting
		
		if(cont == 0) {
			System.out.println("IMPOSSIVEL DE CALCULAR");
		}else {
		  System.out.printf("MEDIA: = %.2f", mediaIdades);
		}
		
		
		
	}
}

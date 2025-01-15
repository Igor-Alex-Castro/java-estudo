package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantPessoa = scanner.nextInt();
		
		double[] altura = new double[quantPessoa];
		String[] genero = new String[quantPessoa];
		
		double menorAltura = 0;
		double maiorAltura = 0;
		
		for (int i = 0; i < altura.length; i++) {
				System.out.print("Altura da" + (i+1) + "a pessoa:  ");
				altura[i] = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("Genero da " + (i+1) + " pessoa: ");
				genero [i] = scanner.nextLine();
				
		}
		
		menorAltura = altura[0];
		maiorAltura = altura[0];
		double totAlturaF = 0;
		double quantF = 0;
		int quantM = 0;
		for (int i = 0; i < altura.length; i++) {
				
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			
			if(maiorAltura  < altura[i]) {
				maiorAltura = altura[i];
			}
			
			if(genero[i].equals("F")) {
				totAlturaF += altura[i];
				quantF += 1;
			}
			
			if(genero[i].equals("M")) {
				quantM += 1;
			}
		}
		
		double mediaF = totAlturaF/quantF;
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n",  mediaF);
		System.out.println("Numero de homens = " + quantM );
	}
}

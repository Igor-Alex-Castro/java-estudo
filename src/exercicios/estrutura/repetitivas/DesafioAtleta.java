package exercicios.estrutura.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtleta {
	private static Double alturaMediaMulheres;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = null;
		char sexo;
		double altura;
		double peso;
		
		double numeroAtletas;
		double quantAtletasM = 0;
		double somaPeso = 0;
		double pesoMedio;
		double atletaMaisAlto = 0;
		String nomeAtletaMaisAlto = null;
		Double porcetagemHomens;
		int quantMulheres = 0;
		double alturaMediaMulheres = 0.0;
		
		System.out.println("Quantidade de Atletas: ");
		numeroAtletas = scanner.nextInt();
		scanner.nextLine();
		int i = 0;
		for ( i = 0; i < numeroAtletas; i++) {
			double aux = 0;
			System.out.println("Digite os dados do atleta numero " + (i+1) + ": ");
			
			
			 System.out.print("Nome: ");
			 nome = scanner.nextLine();
			  
			  System.out.print("Sexo: "); sexo = scanner.nextLine().charAt(0);
			  
			  while(sexo != 'F' && sexo != 'M'){ 
				  System.out.print("Valor invalido! Favor digitar (M) Masculino -- (F) Feminino: "); 
			  	  sexo = scanner.nextLine().charAt(0); 
			  }
			 
			  if(sexo == 'M') {
			  		 quantAtletasM += 1;
			  }
			 
			System.out.print("Altura: ");
			altura = scanner.nextDouble();
			
			while(altura <= 0){
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = scanner.nextDouble();	
			}
			
		
		 	 System.out.print("Peso: "); peso = scanner.nextDouble();
			  
			  while(peso <= 0){
				  System.out.print("Valor invalido! Favor digitar um valor positivo: "); 
				  peso = scanner.nextDouble(); 
			  } 
			  
			  scanner.nextLine();
	
			  somaPeso += peso;
			 		
			if( altura > atletaMaisAlto || i == 0) {
				atletaMaisAlto = altura;
				nomeAtletaMaisAlto = nome;
			}
			
			if(sexo == 'F') {
				quantMulheres += 1;
				 alturaMediaMulheres += altura;
			}
			
		}
		
		pesoMedio = somaPeso/numeroAtletas;
		porcetagemHomens = (quantAtletasM/numeroAtletas)*100;
		System.out.println("");
		System.out.println("RELATORIO");
		System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
		System.out.printf("Atleta mais alto: %s\n", nomeAtletaMaisAlto);
		System.out.printf("Porcentagem de homens:  %.1f%%\n", porcetagemHomens);
		if(quantMulheres == 0) {
			System.out.println("Não há mulheres cadastradas\n");
		}else {			
			 alturaMediaMulheres =  alturaMediaMulheres/quantMulheres;
			 System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
		}
		
	}
}

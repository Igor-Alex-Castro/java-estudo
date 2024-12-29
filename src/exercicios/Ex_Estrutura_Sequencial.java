package exercicios;

import java.util.Locale;
import java.util.Scanner;

public interface Ex_Estrutura_Sequencial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc  =  new Scanner(System.in);
		
		
		double largura;
		double comprimento;
		double valorMetroQuadrado;
		
		double areaTerreno ;
		double precoTerreno;
		System.out.print("Digite a ladgura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		
		areaTerreno =  largura*comprimento;
		precoTerreno = areaTerreno*valorMetroQuadrado;
	
		System.out.printf("Area do terreno = %.2f %n", areaTerreno);
		System.out.printf("Area do terreno = %.2f ", precoTerreno);
		
		sc.close();
		
	}
}

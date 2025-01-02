package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double novoSalario;
		double aumento;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		
		
		if(salario <= 1000) {
			
			novoSalario = salario + salario*0.2;
			aumento = novoSalario - salario;
			
			System.out.printf("Aumento: %.2f\n", aumento);
			System.out.println("Porcentagem = 20%");
		
		}else if(salario > 1000 && salario <= 3000) {
			
			novoSalario = salario + salario*0.15;
			aumento = novoSalario - salario;
			
			System.out.printf("Aumento: %.2f\n", aumento);
			System.out.println("Porcentagem = 15%");
			
		}else if(salario > 3000 && salario <= 8000) {
			novoSalario = salario + salario*0.1;
			aumento = novoSalario - salario;
			
			System.out.printf("Aumento: %.2f\n", aumento);
			System.out.println("Porcentagem = 10%");
			
		}else if( salario > 8000) {
			novoSalario = salario + salario*0.05;
			aumento = novoSalario - salario;
			
			System.out.printf("Aumento: %.2f \n", aumento);
			System.out.println("Porcentagem = 5%");
		}else {
			System.out.println("Nenhuma porcentagem encontrada para este valor");
		}
	 
	}
}

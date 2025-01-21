package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPyer;

public class TaxPayerApplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		List<TaxPyer> listTaxPyers = new ArrayList<>();
		
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int quant =  scanner.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "o  contribuinte: ");
			
			
			System.out.print("Renda anual com salário: ");
			Double  salaryIncome = scanner.nextDouble();
			
			System.out.println("Renda anual com prestação de serviço:");
			Double servicesIncome = scanner.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: ");
			Double  capitalIncome = scanner.nextDouble();
			
			System.out.print("Gastos médicos: ");
			Double  healthSpending = scanner.nextDouble();
			
			System.out.print("Gastos educacionais: ");
			Double educationSpending = scanner.nextDouble();
			
			System.out.println();
			
			TaxPyer taxPyer = new TaxPyer(salaryIncome, 
					servicesIncome, capitalIncome,
					healthSpending, educationSpending);
			
			listTaxPyers.add(taxPyer);
		}
		
		for (int i = 0; i < quant; i++) {
			System.out.println();
			System.out.println("Resumo do " + (i + 1) + "o contribuinte");
			
		    listTaxPyers.get(i).resume();
		    
		}
		
		
	}
}

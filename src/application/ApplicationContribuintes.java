package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuinteFisica;
import entities.ContribuinteJuridico;

public class ApplicationContribuintes{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payres: ");
		int quant = scanner.nextInt();
		scanner.nextLine();
		
		List<Contribuinte> listContribuintes = new ArrayList<Contribuinte>();
		
		for (int i = 0; i <  quant; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data");
			System.out.print("Individual or company (i/c)");
			String type = scanner.nextLine();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = scanner.nextDouble();
			
			if(type.charAt(0) == 'i') {
				
				System.out.print("Health expenditures: ");
				Double healthExpenditures = scanner.nextDouble();
				scanner.nextLine();
				
				ContribuinteFisica contribuinteFisica = 
						new ContribuinteFisica(name, anualIncome, healthExpenditures);
				
				listContribuintes.add(contribuinteFisica);
			}else {
				System.out.println("Number of employees: ");
				int quantEmpoloyess = scanner.nextInt();
				scanner.nextLine();
				
				ContribuinteJuridico contribuinteJuridico = 
						new ContribuinteJuridico(name, anualIncome, quantEmpoloyess);
			
				listContribuintes.add(contribuinteJuridico);
			}
		}
		
		System.out.println("");
		System.out.println("TAXES PAID: ");
		
		Double totalImposto = 0.0;
		for (Contribuinte contribuinte : listContribuintes) {
			System.out.println(contribuinte.print());
			totalImposto += contribuinte.pagaTotalImposto();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", totalImposto);
		
	}
}

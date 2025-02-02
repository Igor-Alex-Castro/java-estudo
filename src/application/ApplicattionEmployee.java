package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Departament;
import entities.Department;
import entities.Employee;
import entities.Employees;
import exercicios.estrutura.repetitivas.quadrante;

public class ApplicattionEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Nome do departamento:  ");
		String name = sc.nextLine();
		
		System.out.print("Dia do pagamento:  ");
		int dia = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Email:  ");
		String email  = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		Address address = new Address(email, telefone);
		Department departament = new Department(name, dia, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int quantFuncionario = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantFuncionario; i++) {
			System.out.println("Dados do funcionário " + (i+1) + ":");
			System.out.print("Nome: ");
			String nameFuncionario = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			
			departament.addEmplyee(new Employee(nameFuncionario, salario));
		
		}
		
		System.out.println();
		System.out.println(departament.toString());
		
	}
	
	
}

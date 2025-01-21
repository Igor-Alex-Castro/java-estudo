package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ExercicioFixaçãoArrayList {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("How many employees will be registered: ");
		int quantEmployees = scanner.nextInt();
		
		System.out.println("");
		List<Employees> listEmployees = new ArrayList<>();
		
		for (int i = 0; i < quantEmployees; i++) {
			System.out.println("Emplyoee " + "#1:" );
			
			System.out.print("Id: ");
			int id = scanner.nextInt();
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();
			
			System.out.println("");
			
			listEmployees.add(new Employees(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = scanner.nextInt();
		
		
		
		int index =	findId(listEmployees, idEmployee);
		if(index == -1) {
			System.out.println("This id does not exist!");
		}else {
			
			System.out.print("Enter the porcentage: ");
			Double porcentage = scanner.nextDouble();
			
			listEmployees.get(index).salaryIncrease(porcentage);
			
			
		}
		
		System.out.println(" ");
		System.out.println("List of employees: ");
		for (Employees emp: listEmployees) {
			System.out.printf("%d, %s, %.2f \n", emp.getId(), emp.getName(), emp.getSalary());
		}
		
	
	}
	
	public static int findId(List<Employees> list, int idEmployee) {
		Employees employees = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		int index = list.indexOf(employees);
	
		return index;
		
	}
}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ApplicationWoker {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		
		
		Worker worker = new Worker(workerName, 
				WorkerLevel.valueOf(workerLevel), 
				baseSalary, 
				new Departament(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		System.out.println("Enter month and wyer to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt( monthAndYear.substring(0,2));
		int year = Integer.parseInt( monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	}

}

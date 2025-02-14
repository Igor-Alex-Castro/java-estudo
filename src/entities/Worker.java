package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel leve;
	private Double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel leve, Double baseDouble, Departament departament) {
		super();
		this.name = name;
		this.leve = leve;
		this.baseSalary = baseDouble;
		this.departament = departament;
		//composição de tem muitos, a lista n vai pra contructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLeve() {
		return leve;
	}

	public void setLeve(WorkerLevel leve) {
		this.leve = leve;
	}

	public Double getBaseDouble() {
		return baseSalary;
	}

	public void setBaseDouble(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		
		contracts.remove(contract);
	}
	
	public Double income(int year, int month) {
		
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {	
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_monrh = 1 + cal.get(Calendar.MONTH);
			
			if(c_year == year && c_monrh == month) {
				sum += c.totalValue();
			}
		}
		
		return sum;
	}
	
	
	
}

package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	private Address address;
	
	private List<Employee> listEmployees = new ArrayList<Employee>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String name, int payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmplyee(Employee employee) {
		this.listEmployees.add(employee);
	}
	
	public void removeEmployee(Employees employee) {
		this.listEmployees.remove(employee);
	}
	
	public double payroll() {
		Double sum = 0.0;
		for (Employee employee : listEmployees) {
			 sum += employee.getSalary();
			 
		}
	
		return sum;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("FOLHA DE PAGAMENTO " + "\n");
		sb.append("Departamento " +  this.name  +" = R$ " + String.format("%.2f",payroll()) + "\n");
		sb.append("Pagamento realizado no dia " +  payDay + "\n");
		sb.append("Funcionários:" + "\n");
		
		for (Employee employee : listEmployees) {
			sb.append(employee.getName() + "\n");
		}
		
		sb.append("Para dúvidas favor entrar em contato: " + address.getEmail() + "\n");
		
		return sb.toString();
	}
	
}

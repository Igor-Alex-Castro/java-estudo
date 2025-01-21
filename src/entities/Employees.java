package entities;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employees(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void salaryIncrease( Double porcentage) {
		this.salary += (this.salary*porcentage)/100;
	}
	
	public Employees findId(List<Employees> listEmployees, int idEmployee) {
		return listEmployees.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
	}
	
}

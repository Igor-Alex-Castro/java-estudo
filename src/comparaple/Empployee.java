package comparaple;

public class Empployee implements Comparable<Empployee> {
	private String name;
	private Double salary;
	
	
	public Empployee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	public int compareTo(Empployee other) {
		// TODO Auto-generated method stub
		return name.compareTo(other.getName());
	}
	
	
}

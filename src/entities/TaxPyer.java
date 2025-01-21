package entities;

import java.security.acl.Group;

public class TaxPyer {
	Double salaryIncome;
	Double servicesIncome;
	Double capitalIncome;
	Double healthSpending;
	Double educationSpending;
	
	//Double salaryTax;
	//Double servicesTax;
	Double capitalTax;
	Double grossTax;
	Double taxRebate;
	Double netTax;
	
	public TaxPyer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}
	
	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	
	public Double getServicesIncome() {
		return servicesIncome;
	}
	
	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	
	public Double getCapitalIncome() {
		return capitalIncome;
	}
	
	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	public Double getHealthSpending() {
		return healthSpending;
	}
	
	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	public Double getEducationSpending() {
		return educationSpending;
	}
	
	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		
		Double salaryIncomeAnual = this.salaryIncome/12;
		
		if( salaryIncomeAnual < 3000) {
			return  0.0;
		}
		
		if(salaryIncomeAnual >= 3000 && salaryIncomeAnual < 5000) {
			return this.salaryIncome*0.1;
		}
		
	    return  this.salaryIncome*0.2;
		
	}
	
	public Double servicesTax() {
		return this.servicesIncome*0.15;
	}
	
	public Double capitalTax() {
		 return this.capitalIncome*0.20;
	}
	
	
	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public Double taxRebate() {
		
		Double maxDeductible = grossTax()*0.3;
		Double deductibleExpenses = this.healthSpending + this.educationSpending;
		
		if( maxDeductible > deductibleExpenses) {
			return deductibleExpenses;
		}
		
		return  maxDeductible;
		
	}
	
	public Double netTax() {
		return (salaryTax() + servicesTax() + capitalTax()) - taxRebate();
	}
	
	public void resume() {
		System.out.printf("Imposto bruto total: %.2f \n", grossTax());
		System.out.printf("Abatimento: %.2f \n", taxRebate());
		System.out.printf("Imposto devido: %.2f \n", netTax());
	}
	
}

package entities;

import java.security.acl.Group;

public class TaxPyer {
	Double salaryIncome;
	Double servicesIncome;
	Double capitalIncome;
	Double healthSpending;
	Double educationSpending;
	
	Double salaryTax;
	Double servicesTax;
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
		
		salaryTax() ;
		servicesTax() ;
		capitalTax() ;
		grossTax() ;
		taxRebate() ;
		netTax() ;

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
	
	
	
	public Double getSalaryTax() {
		return salaryTax;
	}

	public Double getServicesTax() {
		return servicesTax;
	}

	public Double getCapitalTax() {
		return capitalTax;
	}

	public Double getGrossTax() {
		return grossTax;
	}

	public Double getTaxRebate() {
		return taxRebate;
	}

	public Double getNetTax() {
		return netTax;
	}

	public void salaryTax() {
		
		Double salaryIncomeAnual = this.salaryIncome/12;
		
		if( salaryIncomeAnual < 3000) {
			this.salaryTax = 0.0;
		}
		
		if(salaryIncomeAnual >= 3000 && salaryIncomeAnual < 5000) {
			this.salaryTax = this.salaryIncome*0.1;
		}
		
		if( salaryIncomeAnual > 5000) {
			this.salaryTax =  this.salaryIncome*0.2;
		}
		
		
		
	}
	
	public void servicesTax() {
		
		servicesTax = this.servicesIncome*0.15;
		
	}
	
	public void capitalTax() {
		 this.capitalTax = this.capitalIncome*0.20;
	}
	
	
	public void grossTax() {
		this.grossTax = this.salaryTax + this.servicesTax + this.capitalTax;
	}
	
	public void taxRebate() {
		
		Double maxDeductible = (this.grossTax)*0.3;
		Double deductibleExpenses = this.healthSpending + this.educationSpending;
		
		if( maxDeductible > deductibleExpenses) {
			this.taxRebate  = deductibleExpenses;
		}
		
		if( maxDeductible < deductibleExpenses) {
			this.taxRebate =  maxDeductible;
		}
		
	}
	
	public void netTax() {
		this.netTax = (this.salaryTax + this.servicesTax + this.capitalTax) - this.taxRebate;
	}
	
	public void resume() {
		System.out.printf("Imposto bruto total: %.2f \n", getGrossTax());
		System.out.printf("Abatimento: %.2f \n", getTaxRebate());
		System.out.printf("Imposto devido: %.2f \n", getNetTax());
	}
	
}

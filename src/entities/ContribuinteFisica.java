package entities;

public class ContribuinteFisica extends Contribuinte {
	
	private Double gastoSaude;

	public ContribuinteFisica() {
		
	}
	
	public ContribuinteFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double  pagaTotalImposto() {
		
		return impostoRendaAnual() - impostoGastoSaude();
	
	}
	
	public Double impostoGastoSaude() {
		
		Double impostoSaude = 0.0;
		if(gastoSaude > 0) {
			impostoSaude = gastoSaude*0.5;
		}
		
		
		return impostoSaude;
	}
	
	public Double impostoRendaAnual() {
		Double impostoAnual = 0.0;
		
		if(getRendaAnual() < 20000) {
			impostoAnual = getRendaAnual()*0.15;
		}
		
		impostoAnual = getRendaAnual()*0.25;
		
		
		return impostoAnual;
	}
	
	@Override
	public String print() {
		return getName() + ": $" + String.format("%.2f", pagaTotalImposto() ); 
	}
	
}

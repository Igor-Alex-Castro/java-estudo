package entities;

public class ContribuinteJuridico  extends Contribuinte{
	
	private int quantFuncionarios;
	
	public ContribuinteJuridico() {
		
	}
	
	public ContribuinteJuridico(String name, Double rendaAnual, int quantFuncionarios) {
		super(name, rendaAnual);
		this.quantFuncionarios = quantFuncionarios;
	}


	public int getQuantFuncionarios() {
		return quantFuncionarios;
	}

	public void setQuantFuncionarios(int quantFuncionarios) {
		this.quantFuncionarios = quantFuncionarios;
	}
	
	
	@Override
	public Double pagaTotalImposto() {
	
		if(quantFuncionarios > 10) {
			return getRendaAnual()*0.14;
		}
		
		return getRendaAnual()*0.16;
	}
	
	@Override
	public String print() {
		return getName() + ": $" + String.format("%.2f", pagaTotalImposto() ); 
	}
	
	
}

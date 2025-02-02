package entities;

public class ImportedProduct extends Product4{

	private Double  costomsFee;
	
	public ImportedProduct() {
		
	}
	
	
	
	public ImportedProduct(String name, Double price, Double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}

	public Double getCosomsFee() {
		return costomsFee;
	}

	public void setCosomsFee(Double costomsFee) {
		this.costomsFee = costomsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + 
				String.format("%.2f", totalPrice()) + 
				" (Customs fee: $ ) " + String.format("%.2f", costomsFee )  ;
	}
	
	public Double totalPrice() {
		
		return price + costomsFee;
	}
	
	
	
}

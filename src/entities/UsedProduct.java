package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product4 {
	
	final SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy");
	private Date date;
	
	public UsedProduct() {
		
	}

	
	

	public UsedProduct(String name, Double price, Date date) {
		super(name, price);
		this.date = date;
	}




	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + 
				String.format("%.2f", price) + 
				" (Manufacture date) " + sdf1.format(date);
	}
	
	
}	

package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if(feeding() > 30.00) {
			return 0.0;
		}
		
		return 4.00;
		
	}
	
	public double feeding() {
		double tot = (this.beer*5) 
				+ (this.softDrink*3) + 
				(this.barbecue*7);
		return tot ;
	}
	
	public double ticket() {
		if(gender == 'M') {
			return 10.00;
		}
		return 8.00;
	}
	
	public double total(){
		double tot = feeding() + ticket() + cover();
		return tot;
	}
	
	public void relatorio() {
		System.out.print("RELATÓRIO: ");
		
		System.out.printf("Consumo = R$ %.2f\n", feeding() );
		
		if(cover() == 0) {
			System.out.printf("Isento de Couvert\n");
		}else {
			System.out.printf("Couvert = R$ %.2f\n", cover() );
		}
		
		System.out.printf("Ingresso = R$ %.2f\n", ticket() );
		
		System.out.println("");
		
		System.out.printf("Valor a pagar = R$ %.2f\n", total() );
	}
}

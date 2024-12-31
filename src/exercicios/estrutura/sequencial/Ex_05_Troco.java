package exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05_Troco {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 double precoProduto;
	 int quantidade;
	 double dinheiroDadoCliente;
	 
	 double totalApagar;
	 double troco;
	 
	 System.out.print("Preço unitário do produto: ");
	 precoProduto = sc.nextDouble();
	 
	 System.out.print("Quantidade comprada: ");
	 quantidade = sc.nextInt();
	 
	 System.out.print("Dinheiro recebido: ");
	 dinheiroDadoCliente = sc.nextDouble();
	 
	 totalApagar = precoProduto*quantidade;
	 
	 troco = dinheiroDadoCliente - totalApagar;
	 
	 System.out.println("TROCO = " + troco);
	}	
}


package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	
		int codigoProduto;
		int quantPorduto;
		double valorPagar = 0;
		System.out.print("Codigo do produto comprado: ");
		codigoProduto = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		quantPorduto = sc.nextInt();
		
		if(codigoProduto == 1) {
			valorPagar = quantPorduto * 5.00;
		} else if (codigoProduto == 2) {
			valorPagar = quantPorduto * 3.50;
		}else if (codigoProduto == 3) {
			valorPagar = quantPorduto * 4.80;
		}else if (codigoProduto == 4) {
			valorPagar = quantPorduto * 8.90;
		}else if (codigoProduto == 5) {
			valorPagar = quantPorduto * 7.32;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valorPagar);
		
	}
}

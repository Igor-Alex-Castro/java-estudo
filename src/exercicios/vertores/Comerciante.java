package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scanner = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos?  ");
		int quantProd = scanner.nextInt();
		scanner.nextLine();
		
		String[] nomeProdutos = new String[quantProd];
		double[] precoCompra = new double[quantProd];
		double[] precoVenda = new double[quantProd];
		
		for (int i = 0; i <  quantProd; i++) {
			System.out.println("Produto " + (i + 1) + ": ");
			
			System.out.print("Nome: ");
			nomeProdutos[i] = scanner.nextLine();
			
			System.out.print("Preco de compra: ");
			precoCompra[i] = scanner.nextDouble();
			
			System.out.print("Preco de venda: ");
			precoVenda[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		double lucro = 0;
		int quantLucroMenor10 = 0;
		int quantLucroEntre10e20 = 0;
		int quantLucroAcima20 = 0;
		double valorTotCompra = 0.0;
		double valorTotVenda = 0.0;
		
		for (int i = 0; i < quantProd; i++) {
			lucro = ((precoVenda[i]*100)/precoCompra[i]) - 100;
			
			if(lucro < 10){
				quantLucroMenor10 += 1;
			}
			
			if(lucro>=10 && lucro <= 20) {
				 quantLucroEntre10e20 += 1;
			}
			
			if(lucro > 20) {
				quantLucroAcima20 += 1;
			}
			
			valorTotCompra += precoCompra[i];
			valorTotVenda +=  precoVenda[i];
		}
		
		
		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " + quantLucroMenor10 );
		System.out.println("Lucro entre 10% e 20%: " +  quantLucroEntre10e20 );
		System.out.println("Lucro acima de 20%: " + quantLucroAcima20);
		System.out.printf("Valor total de compra: %.2f \n", valorTotCompra);
		System.out.printf("Valor total de venda: %.2f \n", valorTotVenda);
		
		System.out.printf("Lucro total: %.2f", valorTotVenda - valorTotCompra);
	
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramEstoque {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com as informações do produtos: ");
		
		System.out.print("Nome: ");
		product.name = sc.next();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product.toString());
		
		
		System.out.println();
		System.out.print("Entre com o numero de produto a ser adicionado no estoque: ");
		
		int quantity = sc.nextInt();
		product.addPorudcts(quantity);
		
		System.out.println();
		System.out.println("Dados do produto atualizado: " + product.toString());
		
		System.out.println();
		System.out.print("Entre com o numero de produto a ser removidos no estoque: ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados do produto atualizado: " + product.toString());
		
	}
}

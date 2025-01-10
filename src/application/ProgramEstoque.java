package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramEstoque {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com as informações do produtos: ");
		
		System.out.print("Nome: ");
		String name = sc.next();
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName(name);
		
		System.out.println();
		System.out.println("Dados do produto: " + product.toString());
		
		
		System.out.println();
		System.out.print("Entre com o numero de produto a ser adicionado no estoque: ");
		
		quantity = sc.nextInt();
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

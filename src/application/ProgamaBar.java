package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;
import entities.Product;

public class ProgamaBar {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bar = new Bill();
		
		System.out.print("SEXO: ");
		bar.gender = sc.nextLine().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		bar.beer =  sc.nextInt();
		
		System.out.print("Quantidade de refrigerante: ");
		bar.softDrink =  sc.nextInt();
		
		System.out.print("Quantidade de refrigerante: ");
		bar.barbecue =  sc.nextInt();
		
		System.out.println("");
		
		bar.relatorio();
		
	}
}

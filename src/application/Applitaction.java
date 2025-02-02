package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product4;
import entities.UsedProduct;

public class Applitaction {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of product: ");
		int quantPodruct = scanner.nextInt();
		scanner.nextLine();
		
		List<Product4> listProduct4s =  new ArrayList<Product4>();
		
		for (int i = 0; i <  quantPodruct ; i++) {
			
			System.out.println("Product #" + (i+1) + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? " );
			String tipoProduct = scanner.nextLine();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Price: "  );
			Double price = scanner.nextDouble();
			scanner.nextLine();
			
			if(tipoProduct.charAt(0) == 'c') {
				Product4 product4 = new Product4(name, price);
				listProduct4s.add(product4);
			}
			if(tipoProduct.charAt(0) == 'u') {
				
				System.out.print("Manufacture date: ");
				String manuDate = scanner.nextLine();
				
				SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy");
				
				Date date = sdf1.parse(manuDate);	
				
				UsedProduct usedProduct = new UsedProduct(name, price, date);
				listProduct4s.add(usedProduct);
			}
			
			if(tipoProduct.charAt(0) == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = scanner.nextDouble();
				scanner.nextLine();
				
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
				listProduct4s.add(importedProduct);
			}

		}
		
		for (Product4 product4 : listProduct4s) {
			System.out.println(product4.priceTag());
		}
	}
}

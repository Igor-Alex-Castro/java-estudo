package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class ProgramProduct2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product2[] vecto = new Product2[n];
		
		 for(int i = 0; i < vecto.length; i++) {
			 sc.nextLine();
			 String name = sc.nextLine();
			 double price = sc.nextDouble();
			 
			 vecto[i] = new Product2(name, price);
		 }
		 
		 double sum = 0.0;
		 
		 for (int i = 0; i < n; i++) {
			
			sum += vecto[i].getPrice();
		}
		 
		 double avg = sum/n;
				 
		System.out.println("AVERAGE PRICE: " + avg );
		
	}
}

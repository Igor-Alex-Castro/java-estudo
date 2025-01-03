package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Triangulo x,y;
		
		x  = new Triangulo();
		y = new Triangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as medias dos triagulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medias dos triagulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calcArea();
		
		double areaY = y.calcArea();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Area maior: X");
		}else {
			System.out.println("Area maior: Y");
		}
		sc.close();
	}
	
}

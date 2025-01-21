package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		final Double n = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Double R = scanner.nextDouble();
		
		
		Double A = n*(R*R);
		
		System.out.printf("A=%.4f\n", A);
		System.out.println("-");
	}
}

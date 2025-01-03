package exercicios.estrutura.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class crescentes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);

		int x = 0, y = 0;
		
		do {
			
			if(x > y) {
				System.out.println("CRESCENTE!");
			}else if(x < 0) {
				System.out.println("DECRESCENTE!");
			}else {
				System.out.println("");
			}
			
			System.out.println("Digite dois numeros: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			
		}while(x != y);
	}
}

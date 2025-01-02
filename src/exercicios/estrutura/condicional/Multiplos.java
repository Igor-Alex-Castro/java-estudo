package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		   Scanner sc = new Scanner(System.in);
		
			int numero1;
			int numero2;
			
			System.out.println("Digite dois numeros inteiros:");
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
			
			if(numero1 > numero2) {
				if(numero1%numero2 == 0) {
					System.out.printf("Sao multiplos");
				}else {
					System.out.printf("Sao multiplos");
				}
			}else {
				if(numero2%numero1 == 0) {
					System.out.printf("Sao multiplos");
				}else {
					System.out.printf("Sao multiplos");
				}
			}
	}
}

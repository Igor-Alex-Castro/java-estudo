import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {
	public static void main(String[] args) {
		/*
		 * Menos utilizada, mas em alguns  casos se encaixa melhor ao problema.
		 * 
		 * O bloco de comandos executa pelo menos uma vez, pois a condição é
		 * verificada no final.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	  
		char resp;
	   do {
		   System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
		    double F = 9.0 * C / 5.0 + 32.0;
		   
		   System.out.printf("equivalente em Fahrenheit: %.1f%n", F);
		   System.out.print("Deseja repetir (s/n)? ");
		   resp = sc.next().charAt(0);
	   } while (resp != 'n');
		
		
		
		sc.close();
	}
}

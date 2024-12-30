import java.util.Locale;
import java.util.Scanner;

public class ExpressoesCodicional {

	public static void main(String[] args) {
		/*
		 * É uma estrutura de controle que permite 
		 * definir que um certo bloco de comandos somente
		 * será executado dependendo de uma condição. 
		 */
		
		/*Sintaxe simples*/
		int x = 5;
		
		System.out.println("Bom dia");
		
		if(x < 0) { //x < 0 não entra no if// x > 5  entre no if
			System.out.println("Boa tarde");
		}
		
		System.out.println("Boa noite");
		
		//Composta
		Scanner sc = new Scanner(System.in);
		int hora;
		
		
		System.out.print("Quantos horas: ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}else {
			System.out.println("Boa tarde");
		}
		
		// E se tiver mais de duas possibilidade?
		
		//encadeamento de estruturas condicionais.
		
		int horaNova;
		
		
		System.out.print("Quantos horas nova: ");
		horaNova = sc.nextInt();
		
		if(horaNova  < 12) {
			System.out.println("Bom dia");
		}else {
			if(horaNova < 18) {
				System.out.println("Boa tarde");
			}else {
				System.out.println("Boa noite");
			}
			
		}
		
		sc.close();
	}

}

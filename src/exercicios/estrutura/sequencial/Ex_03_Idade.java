package exercicios.estrutura.sequencial;

import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.Scanner;

public class Ex_03_Idade {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nomePrimeraPessoa = "";
		int idadePrimeiraPssoa;
		
		String nomeSegundaPessoa;
		int idadeSegundaPessoa;
		
		double mediaIdadades;
		
		System.out.println("Dados da primera pessoa: ");
		
		System.out.print("Nome: ");
		nomePrimeraPessoa = sc.nextLine();
	
		
		System.out.print("Idade: ");
		idadePrimeiraPssoa = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		
		System.out.print("Nome: ");
		sc.nextLine(); //-> limpa buffer;
		nomeSegundaPessoa = sc.nextLine();
	
		
		System.out.print("Idade:");
		idadeSegundaPessoa = sc.nextInt();
		
		mediaIdadades = (double)(idadePrimeiraPssoa + idadeSegundaPessoa)/2;
		
		System.out.printf("A idade média de " + nomePrimeraPessoa + " e " + nomeSegundaPessoa + " é de %.1f anos", mediaIdadades);
		
		sc.close();
		/*
		 * O problema ao usar o método nextLine() do Scanner logo após um nextInt() 
		 * (ou outros métodos como nextDouble(), nextLong(), etc.) ocorre devido ao comportamento do buffer de entrada.
		 *  O método nextInt() lê apenas o número digitado, mas não consome o caractere de nova linha (\n) 
		 *  que o usuário insere ao pressionar Enter. 
		 *  Esse caractere de nova linha permanece no buffer e é imediatamente consumido pelo nextLine(), 
		 *  fazendo com que ele leia uma string vazia em vez de aguardar a entrada do usuário.

		 * 
		 * */
		}	
}

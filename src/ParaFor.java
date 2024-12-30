import java.util.Scanner;

public class ParaFor {
	public static void main(String[] args) {
		/*
		 * É uma estrutura de controle que repete um bloco de comandos enquanto
		 *  uma condição for verdadeira.
		 *  
		 *  Quando usar: quando não se sabe previamente 
		 *  a quantidade de repetições que será realizada.
		 */
		
		/*Sintaxe/regra*/
		
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		//System.out.println();
		int soma = 0;
		
		while(x != 0) {
			soma =  soma + x; // ou soma += x
			x  = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}

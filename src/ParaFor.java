import java.util.Scanner;

public class ParaFor {
	public static void main(String[] args) {
		/* É uma estrutura de contole que repete
		 *  um bloco de comando para um certo intervalo
		 *  de valores.
		 *  
		 *  Quando usar: quando se sabe previamente a quantidade
		 *  de repetições, ou o intervalo de de valores.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int soma = 0;
		
		for(int c = 0; c < numero ; c++){
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		// Perceba que a esturua para é otima para se fazer uam repetição baseada em 
		//uma CONTAGEM
		//Contagem crescente
		for(int i = 0; i < 5 ; i++){
			System.out.println("Valor de i: " + i);
			
		}
		System.out.println("-----");
		for(int i = 5; i > 0 ; i--){
			System.out.println("Valor de i: " + i);
			
		}
	}
}

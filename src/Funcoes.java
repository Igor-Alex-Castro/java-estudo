import java.util.Scanner;

public class Funcoes {
	public static void main(String[] args) {
		/*
		 * Representam um processamento que possui um significado
		 * 
		 * Principais vantagens: modularização, delegação, reaproveitamento
		 * 
		 * Dados de entrada e saida
		 * 		Funcoes podem receber dados de entrada(parametros ou argumentos)
		 * 		Funcoes podem ou nao retornar uma saida
		 * 
		 * 
		 * Em oricentação a objetos, funcoes em classes recebem o nome de metodos
		 * */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
		
		
	}
	
	//fique disponivel em outras classes
	//static n precisa criar um obj
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux =  a;
		}else if(b > c && b > a) {
			 aux = b;
		}else {
			aux = c;
		}
		
		return aux;
	}
	
	public static void showResult(int maior) {
		System.out.println("Miaor: " + maior);
	}
}

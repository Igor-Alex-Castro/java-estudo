package exercicios.vertores;

import java.util.Scanner;

public class MaisVelho {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? " );
		int quantPessoas = scanner.nextInt();
		
		String[] vetorNome = new String[quantPessoas];
		int[] vetorIdade = new int[quantPessoas];
		
		for (int i = 0; i < vetorNome.length; i++) {
			
			System.out.println("Dados da" +  (i+1) +"a pessoa:");
			scanner.nextLine();
			
			System.out.print("Nome: ");
			vetorNome[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			vetorIdade[i] = scanner.nextInt();
		}
		
		int maisVelho = vetorIdade[0];
		int posMaisVelho = 0;
		for (int i = 0; i < vetorIdade.length; i++) {
			 
			if(maisVelho < vetorIdade[i]) {
				maisVelho = vetorIdade[i];
				posMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetorNome[posMaisVelho] );
	}
}

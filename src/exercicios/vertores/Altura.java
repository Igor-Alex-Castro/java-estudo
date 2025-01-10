package exercicios.vertores;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;


public class Altura {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int numPessoas = scanner.nextInt();
		scanner.nextLine();
		
		Pessoa[] vetPessoas = new Pessoa[numPessoas];
		double soma = 0.0;
		double qunatPessoa16 = 0;
		
		for (int i = 0; i < vetPessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			
			System.out.print("Altura: ");
			double altura = scanner.nextDouble();
			 scanner.nextLine();
			 
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			vetPessoas[i] = pessoa;
			
			 soma += vetPessoas[i].getAltura();
			 
			 if(vetPessoas[i].getIdade() < 16) {
				 qunatPessoa16 += 1;
			 }
		}
		
		double media = soma / vetPessoas.length;
		
		System.out.printf("Altura média: %.2f\n", media);
		
		double porcentoPessoa16Menos = (qunatPessoa16/vetPessoas.length)*100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentoPessoa16Menos );
		
		for(int i = 0; i < vetPessoas.length; i++) {
			if(vetPessoas[i].getIdade() < 16) {
				System.out.println(vetPessoas[i].getNome());
			}
		}
	}
}

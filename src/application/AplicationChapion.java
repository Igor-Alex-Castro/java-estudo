package application;

import java.util.Scanner;

import entities.Champion;

public class AplicationChapion {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Digite os dados do primeiro campeão:");
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Vida inicial: ");
		int vida = scanner.nextInt();
		
		System.out.print("Ataque: ");
		int ataque = scanner.nextInt();
		
		System.out.print("Armadura: ");
		int armadura = scanner.nextInt();
		
		Champion champion1 = new Champion(nome, vida, ataque, armadura);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		
		scanner.nextLine();
		System.out.print("Nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Vida inicial: ");
		vida = scanner.nextInt();
		
		System.out.print("Ataque: ");
		ataque = scanner.nextInt();
		
		System.out.print("Armadura: ");
		armadura = scanner.nextInt();
		 
		Champion champion2 = new Champion(nome, vida, ataque, armadura);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = scanner.nextInt();
		
		for (int i = 0; i < turnos; i++) {
			System.out.println();
			System.out.println("Resultado do turno " +  (i+1) + ": ");
			
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			if(champion1.getLife() == 0) {
				System.out.println(champion1.getName() + ": " + champion1.getLife() + " de vida a (morreu)");
				
			}else {
				System.out.println(champion1.getName() + ": " + champion1.getLife() + " de vida");
			}
			
			if(champion2.getLife() == 0) {
				System.out.println(champion2.getName() + ": " + champion2.getLife() + " de vida a (morreu)");
				
			}else {
				System.out.println(champion2.getName() + ": " + champion2.getLife() + " de vida");
			}
			
			if(champion1.getLife() == 0 || champion2.getLife()==0) {
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("FIM DE COMBATE");
	}
}

package exercicios.vertores;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import exercicios.estrutura.condicional.Notas;

public class Aprovados {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int quantAlunos = scanner.nextInt();
		scanner.nextLine();
		Aluno[] vetorAlunos = new Aluno[quantAlunos];
		double[] notas;
		Aluno aluno;
		
		for (int i = 0; i < vetorAlunos.length ; i++) {
			aluno  = new Aluno();
			
			notas = new double[2];
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			
			String nome = scanner.nextLine();
			aluno.setNome(nome);
			
			
			notas[0] = scanner.nextDouble();
			notas[1] = scanner.nextDouble();
			aluno.setNotas(notas);
			
			vetorAlunos[i] = aluno;
			scanner.nextLine();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vetorAlunos.length; i++) {
			if (vetorAlunos[i].aprovado()) {
				System.out.println(vetorAlunos[i].getNome());
			}
		}
	}
}

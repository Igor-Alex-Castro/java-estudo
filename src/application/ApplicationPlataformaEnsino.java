package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class ApplicationPlataformaEnsino {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Quantas aulas tem o curso? ");
		int quantAulas = scanner.nextInt();
		scanner.nextLine();
		
		List<Lesson> listLesson = new ArrayList<Lesson>();
		
		for (int i = 0; i < quantAulas; i++) {
			System.out.println();
			System.out.println("Dados da " + (1 +i) + "a aula");
			System.out.print("Conteúdo ou tarefa (c/t)?");
			char tipoAula = scanner.nextLine().charAt(0);
			
			System.out.print("Título: ");
			String titulo = scanner.nextLine();
			
			if(tipoAula == 'c') {
				System.out.print("URL do vídeo: ");
				String url = scanner.nextLine();
				
				System.out.println("Duração em segundos: ");
				int segundos = scanner.nextInt();
				scanner.nextLine();
				
				listLesson.add(new Video(titulo, url, segundos));
				
			}else {
				System.out.print("Descrição: ");
				String descricao = scanner.nextLine();
				
				System.out.print("Quantidade de questões: ");
				int quantQuestoes = scanner.nextInt();
				scanner.nextLine();
				
				listLesson.add(new  Task(titulo, descricao, quantQuestoes));
			}
		}
		
		
		
		int duracaoTotal = 0;
		
		for (Lesson lesson : listLesson) {
			
			duracaoTotal += lesson.duration();
		}
		
		System.out.println();
		System.out.print("DURAÇÃO TOTAL DO CURSO = " + duracaoTotal + " segundos");
		
	}
}

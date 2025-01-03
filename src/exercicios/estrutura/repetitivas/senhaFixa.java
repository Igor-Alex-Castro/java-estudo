package exercicios.estrutura.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class senhaFixa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int senha;
		final int SENHA_VALIDA = 2002;
		
		System.out.printf("Digite a senha: ");
		senha = scanner.nextInt();
		do {
			if(senha != SENHA_VALIDA) {
				System.out.printf("Senha Invalida! Tente novamente: ");
				senha = scanner.nextInt();
			}
			
			if(senha == SENHA_VALIDA) {
				System.out.println("Acesso permitido!");
			}
			
		}while(senha != SENHA_VALIDA);
		
	}
}

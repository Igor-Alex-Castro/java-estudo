package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_07_Pagamento {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

	 String nomeFuncionario;
	 double valorHora;
	 int horasTrabalhadas;
	 
	 double pagamentoFuncionario;
	 
	 System.out.print("Nome: ");
     nomeFuncionario = sc.nextLine();
     
     System.out.print("Valor por hora: ");
     valorHora = sc.nextDouble();
     
     System.out.print("Horas trabalhadas: ");
     horasTrabalhadas = sc.nextInt();
     
     pagamentoFuncionario = valorHora*horasTrabalhadas;
     
     System.out.printf("O pagamento para %s deve ser %.2f", nomeFuncionario, pagamentoFuncionario);
	 
	}	
}


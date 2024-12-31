
package exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Ex_04_Soma {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 int numeroX;
	 int numeroY;
	 
	 int soma;
	 
	 System.out.print("Digite o valor x: ");
	 numeroX = sc.nextInt();
	 
	 System.out.print("Digite o valor y: ");
	 numeroY = sc.nextInt();
	 
	 soma = numeroX +  numeroY;
	 
	System.out.println("SOMA: " + soma);
	}	
}

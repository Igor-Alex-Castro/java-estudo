import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		//Entrada de dados
		//usuario fornece dados para o programa
		//também chamad de leitura
		//o programa está lendo dados
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		//String
		String x;
		
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		//inteiro
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou o numero: " + y);
		
		//Double
		double z;
		
		z = sc.nextDouble();
		System.out.printf("Você digitou o numero flutuante: %.2f ", z);
		
		//Char
		char a;
		a = sc.next().charAt(0);
		System.out.println("O caracter que digitou foi: " + a);
		
		
		//ler varios dados na mesma linha
		String palavra;
		int numero;
		double decimal;
		
		palavra = sc.next();
		numero = sc.nextInt();
		decimal = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(palavra);
		System.out.println(numero);
		System.out.println(decimal);
			
		
		sc.close();
		
	}

}

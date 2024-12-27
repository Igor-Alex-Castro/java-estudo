import java.util.Locale;

public class Saida {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x); //%.4f% 4 casa depois da virgula, N quebra a linha
		
		Locale.setDefault(Locale.US); //Localização do programa;
		System.out.printf("%.4f%n", x); 
		
		
		System.out.println("RESULTADO = " + x + " metros");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		/*
		 * %d -> inteiro
		 * %f -> ponto flutuantes
		 * %s -> texto
		 * %n -> quebra de linha
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s  tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}

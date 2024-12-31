package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double precoUnitario;
		int quantidadeComprada;
		double dinheiroRecebido;
		double precoTotal;
		double pagar;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		
		System.out.print("Preço unitário do produto: ");
		quantidadeComprada = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		precoTotal = precoUnitario*quantidadeComprada;
		
		if(precoTotal > dinheiroRecebido) {
			pagar = precoTotal - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", pagar );
		}else {
			pagar = dinheiroRecebido - precoTotal;
			System.out.printf("TROCO: %.2f ",  pagar );
		}
		
	}
}

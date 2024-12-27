
public class Casting {

	public static void main(String[] args) {
		//Processamento de dados
		//Comando de atribuição
		
		//sintaxe
		
		//<variavel > =  <expressâo>
		//= le-se recebe
		
		/*Primeiro exemblo*/
		int x,y;
		
		x = 5;
		y = 2*x;
		
		System.out.println(x);
		System.out.println(y);
		
		//------------------------------------------------
		int a;
		double b;
		
		a = 5;
		b =  2*a;
		
		/*Segundo exemplo*/
		System.out.println(a);
		System.out.println(b);
		
		/*Terceiro exemplo*/
		
		double b_menor,B_maior, h, area;
		//Boa pática
		//Sempre indique o tipo do número, se a expressão for de ponto flutuante 
		//(não inteira)
		//para double use: .0
		// para flor use: f
		b_menor = 6.0;
		B_maior = 8.0;
		h = 5.0;
		
		area = (b_menor + B_maior)/2.0*h;
		
		System.out.println(area);
		
		/*Quarto exemplo*/
		
		int c,d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) a/d;
		//número inteiro divindo um número inteiro, entende-se que é um número inteiro
		//para corrigir isto basta adicionar casting (double)
		System.out.println(resultado);
		
		/*Quinto exemplo*/
		
		double e;
		
		int f;
		
		e = 5.0;
		
		f = (int) e;
		
		System.out.println(f);
		
	}

}

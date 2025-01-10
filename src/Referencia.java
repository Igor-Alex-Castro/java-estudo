
public class Referencia {
	/*
	 * Clase são tipos de referencia
	 * 
	 * Variaveis cujo tipo são classes não devem ser entendias como caixas, mas sim como tentaculos(ponteiros)
	 * para caixas..
	 * 
	 * 
	 * Quandos criamos uma variavel do tipo p1 e p2, estarão alocadas na memoria na area de memoria chamada stack
	 * 
	 * quando fazemos o new, aloca um obj na area de memor heap, area de memoria os objetos em tempo de execução
	 * 
	 * alocação dinamica de memoria
	 * 
	 * a p1(stack) quarda a endereço de memoria que corresponde o endereço do obj.
	 * 
	 * 
	 * p2 = p1
	 * 
	 * p2 passa apontar para pnde aponta p1
	 * 
	 * vallor null
	 * 
	 * Tipos referencias aceitam valor null, que indica que a variável aponta para ninguém
	 * 
	 * Tipos primitvos que são do tipo valor
	 * 		Em java, tipos primitivos são tipos valor, Tipos valor são CAIXAS e não ponteiros.
	 *
	 * 
	 * Valores padrão
	 * 		Quando alocamos (new ) qualquer tipo estruturado(classe ou array), são atribuídos valores padrão
	 * 		aos seus elementos.
	 * 			numeros: 0
	 * 			boolean: false
	 * 			char: 0
	 * 			objeto: null
	 * 
	 * */
	
	
	public static void main(String[] args) {
		int p; 
		p = 10;
		
		
		System.out.println(p);
	}

}

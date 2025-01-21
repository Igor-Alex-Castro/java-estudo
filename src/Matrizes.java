import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
	// Em programação, "matriz" é o nome dado a arranjos bidimensionais
	
	//Arranjo(array) é uma estrutura de dados:
		//homogenea
		//Ordenada
		//Alocada
	//Vantagens
		//Acesso imediado aos elemetnos pela sua posição
	//Destavangens
		//tamanho fixo
		//Dificuldade para se realizar inserções e deleçõe
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner =  new Scanner(System.in);
		
		int tamanhoMatiz = scanner.nextInt();
		int[][] matriz = new int[tamanhoMatiz][tamanhoMatiz];
		
		int[] diagonalPrincipal = new int[tamanhoMatiz];
		Integer[] numeroNegativo = new Integer[tamanhoMatiz*tamanhoMatiz];
		
		int c = 0;
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scanner.nextInt();
				
				if(i == j) {
					diagonalPrincipal[i] = matriz[i][j];
				}
				
				if(matriz[i][j] < 0) {
					numeroNegativo[c] = matriz[i][j];
					c++;
				}
			}
		}
		
		System.out.println("Mian diagonal: ");
		for (int d : diagonalPrincipal) {
			
			System.out.print(d + " ");
		}
		
		System.out.println();
		
		System.out.print("Negative numbers  = ");
		for (Integer n : numeroNegativo) {
			if(n != null) {
				System.out.print(n + " ");
			}
			
		}
		
		scanner.close();
		
	}
 }

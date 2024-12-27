import java.util.Locale;
import java.util.Scanner;

public class QuebraDeLinha {

	public static void main(String[] args) {
		// Para ler um texto até uma quebra de linha

		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s1, s2, s3; s1 = sc.nextLine(); s2 = sc.nextLine(); s3 =
		 * sc.nextLine();
		 * 
		 * System.out.println("Ddaos digitados: " ); System.out.println(s1);
		 * System.out.println(s2); System.out.println(s3);
		 */

		// quebra de linha pendente
		
		
		  Locale.setDefault(Locale.US);
		  
		  Scanner sc = new Scanner(System.in);
		  
		  int x;
		  String s1, s2, s3; 
		  
		  x = sc.nextInt();
		  //sc.nextLine();
		  s1 = sc.nextLine(); 
		  s2 = sc.nextLine(); 
		  s3 = sc.nextLine();
		  
		  System.out.println("Ddaos digitados: " );
		  System.out.println(x);
		  System.out.println(s1);
		  System.out.println(s2);
		  System.out.println(s3);
		

	}

}

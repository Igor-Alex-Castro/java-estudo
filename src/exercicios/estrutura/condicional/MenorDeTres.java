package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
		
	    int primeiroNum;
	    int segundoNum;
	    int terceiroNum;
	    
	    System.out.print("Primeiro valor:");
	    primeiroNum = sc.nextInt();
	    
	    System.out.print("Segundo valor: ");
	    segundoNum = sc.nextInt();
	    
	    System.out.print("Teceiro valor: ");
	    terceiroNum = sc.nextInt();
	    
	  
	    
	    if(primeiroNum <= segundoNum && primeiroNum <= terceiroNum) {
	    	System.out.println("MENOR = " + primeiroNum);
	    }else {
	    	if(segundoNum < terceiroNum) {
	    		System.out.println("MENOR = " + segundoNum);
	    	}else {
	    		System.out.println("MENOR = " + terceiroNum);
	    	}
	    }
	   
	   
	}
}

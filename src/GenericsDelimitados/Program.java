package GenericsDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Generics.PrintService;
import comparaple.Empployee;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "C:\\files\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line =  br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationSerivice.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " +  e.getMessage());
		}
	}
}

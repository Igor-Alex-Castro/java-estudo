package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationFile {
	public static void main(String[] args) {
		
		
		File file = new File("C:\\files\\in.txt");
	Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			int c = 1;
		while(sc.hasNext()) {
				System.out.println(c + " " + sc.nextLine());
				c++;
		}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
			
		}
	}
}

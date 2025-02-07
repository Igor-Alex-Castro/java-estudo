package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationBufferRead {
	public static void main(String[] args) {
		
		String path = "C:\\files\\in.txt";
	
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.print(line);
				line = br.readLine();
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
		
}

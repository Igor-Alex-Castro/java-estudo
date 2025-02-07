package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicaonFileWriter {
	public static void main(String[] args) {
		String[] lines = new String[] {"Goor morning", "Good afternoon", "Good nigth"};
		
		String path = "C:\\files\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

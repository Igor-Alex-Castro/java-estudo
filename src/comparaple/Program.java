package comparaple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Empployee> list = new ArrayList<>();
		String path = "C:\\files\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String empployeeCsv =  br.readLine();
			while(empployeeCsv != null) {
				String[] field = empployeeCsv.split(",");
				list.add(new Empployee(field[0], Double.parseDouble(field[1])));
				empployeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for(Empployee emp: list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " +  e.getMessage());
		}
	}
}

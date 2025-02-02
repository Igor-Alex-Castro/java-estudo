import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProgram {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Igor\\Documents");
		
		Scanner sc =null;
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("finally block executec");
		}
	}
}

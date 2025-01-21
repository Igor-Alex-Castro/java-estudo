import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		//List x = new List();
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		System.out.println(list.size());
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		//list.remove("Anna");	
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		System.out.println("Index of Bob: " + list.indexOf("bob"));
		//quando index of n encontra valor, retorna -1;
		
		System.out.println("----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
			

		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------");
		
		String name =  list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}

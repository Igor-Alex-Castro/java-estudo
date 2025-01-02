
public class FuncoeString {
	public static void main(String[] args) {
		//Formatar: toLowerCase(), toUpperCase(), trim()
		//Recortar: substring(inicio), subistring(inicio, fim)
		//substituir: replace(char, char), Rplace(string, string)
		//buscar: indexOf,LastIndexOf
		//str.split("")
		
		String original = "asdasd ASDASD adssdsa ADA     /";
		String s01 = original.toLowerCase();
		
		System.out.println(original + " -- " + s01+ "-");
		
		String s02 = original.toUpperCase();
		System.out.println(original + " -- " + s02 + "-");
		
		String s03 = original.trim();
		System.out.println(original + " -- " + s03 + "-");
		
		String s04 = original.substring(2);
		System.out.println(s04);
		
		String s05 = original.substring(2, 9);
		System.out.println(s05);
		
		String s06 = original.replace('a', 'x');
		System.out.println(s06);
		
		String s07 = original.replace("asda", "x");
		System.out.println(s07);
		
		int s08 = original.indexOf("as");
		System.out.println(s08);
		
		int s09 = original.lastIndexOf("as");
		System.out.println(s09);
		
		String s = "patato apple lemon";
		
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}


public class BoxinWrapper {
	public static void main(String[] args) {
		
		/*
		 * Boning
		 * Transformar um obj tipo valor para obj tipo referencia;
		 * stack -> heap
		 * 
		 * unBoxing
		 * Transformar um obj do tipo referencia para tipo valor
		 */
		int x  = 20;
		
		Object obj  = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(obj);
		
	}
}

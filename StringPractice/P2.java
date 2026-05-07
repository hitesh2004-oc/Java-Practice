package StringPractice;

public class P2 {
	public static void main(String[] args) {
		// Using new Keyword
		// Now String Object will Store in Heap area
		String s = new String("Hello World");
		
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		
	}

}

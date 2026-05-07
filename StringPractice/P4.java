package StringPractice;

public class P4 {
	public static void main(String[] args) {
		// *** Recommended Way to Create String *** //
		String s = "Hello"; 
		
		// String Method
		// length()
		System.out.println(s.length());
		
		// charAt()
		System.out.println(s.charAt(0));
		
		// subString()
		System.out.println(s.substring(0,3));
		
		// trim()
		System.out.println(s.trim());
		
		// replace()
		System.out.println(s.replace("H", ""));
		
		// contains()
		System.out.println(s.contains("H"));
		
		// startsWith()  & endsWith()
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("H"));
		
		// split() Use for Convert String into Array
		String[] arr = s.split("");
		for(String i : arr) {
			System.out.println(i);
		}
		
		
		
	}

}

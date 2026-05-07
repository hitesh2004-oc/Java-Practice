package StringPractice;

public class P3 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		// Methods for Check String Reference and Content
		// Check Reference
		System.out.println(s1 == s2);
		
		// Check Content
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		// Check Reference (Every Time Create New Object)
		System.out.println(s3 == s4);
		
		// Check Content
		System.out.println(s3.equals(s4));
		
	}

}

package StringPractice;

// String is Sequence of Character
// There are Two way to Create String
// (1) String Literal    (2) Using new Keyword
// There are three type of String 
// (1) Numeric  (2) Alphabetic  (3) Alphanumeric
public class P1 {
	public static void main(String[] args) {
		// String Literal
		// When We use String Literal for Create String
		// That will store in SCP (String Constant Pool)
		String s = "Hello World"; // Store in SCP
		
		// for Iterate String 
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

}

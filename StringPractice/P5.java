package StringPractice;

// StringBuffer :- Mutable, ThreadSafe, Synchronized, Slower than StringBuilder
// StringBuilder :- Mutable, NotThreadSafe, Asynchronized, Faster than StringBuffer & String
public class P5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		// Same Method StringBuffer & StringBuilder
		// append()
		sb.append("World");
		System.out.println(sb);
		
		// insert()
		sb.insert(5, " ");
		System.out.println(sb);
		
		// delete()  && deleteCharAt()
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		// reverse()
		sb.reverse();
		System.out.println(sb);
		
		//replace()
		sb.replace(0, 1, "hello");
		System.out.println(sb);
		
		// setCharAt()
		sb.setCharAt(0, 'Y');
		System.out.println(sb);
		
		
	}
}

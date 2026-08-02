package Exception_Handling;
//... Null Pointer Exception ...//
public class P2 {
	void Display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		P2 p = null;
     	p.Display();
	
	}

}

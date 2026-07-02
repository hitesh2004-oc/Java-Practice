package Pattern_Practice;

public class P3 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++) {
			char c = 'A';
			for(int j = 1; j<=n; j++) {
				if(i + j >= n+1) { System.out.print(c);  c++;}
				else System.out.print(" ");
			}
			c--;
			for(int j = 2; j<=n; j++) {
				if(i >= j ){c--; System.out.print(c); }
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}

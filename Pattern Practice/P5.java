package Pattern_Practice;

public class P5 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++) {
			for(int k = 1; k<=n; k++) {
				if(i>=k) {
					System.out.print(" ");
				}
			}
			for(int j = 1; j<=n; j++) {
				if(i+j==n+1 || j == 1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i = 2; i<=n; i++) {
			for(int k = 1; k<=n; k++) {
				if(i<=k) {
					System.out.print(" ");
				}
			}
			for(int j = 1; j<=n; j++) {
				if(i==j || j == 1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
	}

}

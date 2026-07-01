package Pattern_Practice;

public class P2 {
	public static void main(String[] args) {
		int n = 5;
		char c = 'A';
		int a =1;
		for(int i = 1; i<=n; i++) {
			if(i%2==0) a = 0;
			else a = 1;
			for(int j = 1; j<=n; j++) {
				
				if(i>=j && a == 1) {
					System.out.print(a+" ");
					a=0;
				}else if(i>=j && a == 0) {
					System.out.print(a+" ");
					a=1;
				}
				else System.out.print("  ");
			}
			c++;
			System.out.println();
		}
	}

}

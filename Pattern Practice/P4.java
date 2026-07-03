package Pattern_Practice;

public class P4 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <=rows; i++) {
          
            for(int j = 1; j<=rows - i ; j++) {
                System.out.print(" ");
            }

            int num = 1;
          
            for (int j = 1; j<=i; j++) {
                System.out.print(num+" ");
                num = num * (i - j) / j ;
            }

            System.out.println();
        }
    }
}

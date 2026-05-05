package ArrayPractice;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
//	    for(int[] i : arr) {
//	    	   for(int j : i) {
//	    		   j = sc.nextInt();
//	    	   }
//	    }
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
			   arr[i][j] = sc.nextInt();
			}
		}
		
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				System.err.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	    for(int[] i : arr) {
	    	   for(int j : i) {
	    		  System.out.print(j+" ");
	    	   }
	    	   System.out.println();
	    }
	}

}

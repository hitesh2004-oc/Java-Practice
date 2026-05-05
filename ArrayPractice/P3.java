package ArrayPractice;

public class P3 {
	public static void main(String[] args) {
		// 2D Array [Two Dimensional Array]
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// 1 way for Iterate 2D Array
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 2 way for Iterate 2D Array
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.err.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

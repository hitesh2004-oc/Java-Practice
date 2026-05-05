package ArrayPractice;

public class P2 {
	public static void main(String[] args) {
		// direct Initialize value into the arr
		int arr[] = {10,20,30,40};
		arr[0] = 20;
		
		// For Iterate Array
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String arr1[] = {"hitesh","Vinod","Mohit"};
		for(String s : arr1) {
			System.out.println(s);
		}
	}
}

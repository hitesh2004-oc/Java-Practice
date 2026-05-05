package ArrayPractice;

// Array is Collection of Same DataType
// There Are Two Type of Array
// 1D Array   ,   2D Array
public class P1 {
	public static void main(String[] args) {
		// 1D Array 
		// Create Array Using new Keyword
		// Array is Homogenius
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		// that is Give HashCode
		// System.out.println(arr);
		
		// For Iterate Array
		for(int i : arr) {
			System.out.println(i);
		}
	}

}

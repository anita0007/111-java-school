public class MyClass {
	public static void main (String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		int x = 10;

		setVariable(x);
		System.out.println("setVariable "+ x);
		
		setArray(arr);
		for(int item : arr)
			System.out.println("setArray " +item);
		
	}
	
	public static void setVariable (int x) {
		x = 20;
	}
	public static void setArray (int arr[]) {
		arr[0] = 20;
	}
	
}

	
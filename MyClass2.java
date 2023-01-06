public class MyClass2 {
	public static void main (String[] args) {
		int x = 10;
		int y = x;
		y = 20;
		
		System.out.println("setVariable "+ x);
		System.out.println("setVariable "+ y);
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = arr;
		arr2[0] = 10;
		System.out.println("setArray "+ arr[0]);
		System.out.println("setArray "+ arr2[0]);
	}
}
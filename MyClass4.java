public class MyClass4 {
	public static void main (String[] args) {	
		int total = 0;
		for (String str : args) {
			total+= Integer.parseInt(str);
			System.out.println("args[] "+str);
		}
		System.out.println("total" +total);
	}
}
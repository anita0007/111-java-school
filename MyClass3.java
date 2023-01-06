public class MyClass3 {
	public static void main (String[] args) {	
		int x = 10;
		double y = 10.0;						//多載==>同名方法	輸入不同的型態、數量 自己去找他自己的函式
		x = setV(x);
		x = setV(x, 3);
		y = setV(y);
		System.out.println("x "+ setV(x));
		System.out.println("x,y "+ setV(x,3));		
		System.out.println("y "+ setV(y));
	}
	public static int setV (int x) {
		return x = 20;
	}
	public static int setV (int x , int y) {
		return x = 40;
	}
	public static double setV (double x) {
		return x = 30.0;
	}
	
}
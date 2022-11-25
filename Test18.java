public class Test18 {
    public static void main(String[] args) {   
        Test22 t22 = new Test22();
        int a = t22.add(7,4);
        System.out.printf("%d",a);
    }
}
public class Test22 {
	public int add (int x,int y) {
        return x + y;
    }
}
        
public class Test20{
	public static void main(String[] args){
	int[] data = new int[1];
	data[0]=1;
	System.out.println(data[0]);
	
	Test21.printhight();
	
	Test21 t = new Test21();
	t.printlow();
	}
}
class Test21{
	static int hight = 100;                    
	int low = 50;
	
	public static void printhight(){   
		System.out.println(hight);
	}
	public void printlow(){
		System.out.println(low);
	}
}
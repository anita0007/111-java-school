import java.util.Scanner;
public class Test21{
    public static void main(String[] args){
		int km;
		int money = 85;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter km:");
        km =input.nextInt();
		
		for(int i = 8;i<=km;i++){
			money = money + 5;
		}
		System.out.printf("money is : %d", money);	
	}
}
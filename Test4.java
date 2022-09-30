import java.util.Scanner;

public class Test4{
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 =input.nextInt();
        
        if (num1 >= 60 & num1 <= 70) {
                System.out.println("<=70");
            }
            else{
                System.out.println("<60");
            }
        }
    }
}
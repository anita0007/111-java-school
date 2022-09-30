import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 =input.nextInt();
        
        if (num1 >= 90) {
            System.out.println("Goooood~~");
        }
        else if (num1 >=80 ) {
            System.out.println("great!");
        }
        else if (num1 >=60 ) {
            System.out.println("good!");
        }
        else {
            System.out.println("fail!!!");
        }
    }
}
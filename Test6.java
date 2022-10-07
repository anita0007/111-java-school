import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        int grade; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade =input.nextInt();
        switch (grade) {
            case 90:
                println("A");
                break;
            case 80:
                println("B");
                break;
            case 70:
                println("C");
                break;
            case 60:
                println("D");
                break;
            default:
                println("E");
                break;
        }
                
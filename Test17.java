public class Test17 {
    public static void main(String[] args) {
        float a = 0.0f;
        float b = 0.2f;
        int c = 11;
        
            c = c > 10 ? 10 : 9 ;
            System.out.printf("%d",c);
        
        a += 0.1;
        a += 0.1;
        
        if (a == b)                       
            System.out.printf("a == b");  
        else
            System.out.printf("a != b");
    }
}
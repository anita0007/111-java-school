public class Test9{
    public static void main(String[] args){
        int row = 0;
		String star = "*";
        while (row < 5 ) {              //決定列印幾行，一個迴圈做一個判斷
			int b = 4 - row;
			while (b > 0 ){
				System.out.print(" ");
				b = b - 1;
			}	
			System.out.println(star);
			star = star + "**" ;

			row = row + 1;	
        }
    }
}
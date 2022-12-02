public class User1{
	public static void main(String[] args){
        int[] iArr = {7, 3, 4, 9, 6};
        int temp;
        for (int x = 0;x<iArr.length;x++) {
            for (int y =5 - x ;y<iArr.length-x;y++) {
                if (iArr[x] > iArr[y]) {
                    temp = iArr[x];
                    iArr[x] = iArr[y];
                    iArr[y] = temp;
                }
            } 
        }
        for (int x = 0; x<iArr.length; x++) 
            System.out.println(iArr[x]);    
	}
}
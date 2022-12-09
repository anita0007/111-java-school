public class User1{
	public static void main(String[] args){
        int[] iArr = {7, 3, 4, 9, 6};
		int count = 0;
        int temp;
        for (int x = 0;x < iArr.length;x++) {
            for (int y = x+1 ;y <= iArr.length-1;y++) {
                if (iArr[x] > iArr[y]) {
                    temp = iArr[x];
                    iArr[x] = iArr[y];
                    iArr[y] = temp;
				}
				count++;
            } 
        }
        for (int x = 0; x < iArr.length; x++) {
            System.out.println(iArr[x]);   
		}
		System.out.println(count);   
	}
}
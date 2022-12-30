import java.util.Arrays;
public class User6{
	public static void main(String[] args){
        Integer[] iArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int left =0 ;
        int right = iArr.length - 1 ;
		int medianIndex = 0;
		int target = 2;
		int count = 0;
		int targetIndex = 0;

		for(int i = 0;i<3;i++) {
			medianIndex = (right-left) / 2 +left;
			if(iArr[medianIndex]== target) {
				targetIndex = medianIndex;
				break;
			}
			count++;
			
			if (target >iArr[medianIndex] ) { 
				right = medianIndex;
			} 
			else {
				left = medianIndex;
			}

		}
		System.out.println("The position is "+medianIndex);
		System.out.println("count "+count);
	}
}
import java.util.Arrays;
public class User5{
	public static void main(String[] args){
        Integer[] iArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int left =0 ;
        int right = iArr.length - 1 ;
		int mid =(left + right)/2;
		int target = 2;
		int count = 0;
		int targetIndex = 0;

		while(left <= right) {
			if(iArr[mid]== target) {
				targetIndex = mid;
				break;
			}
			if (iArr[mid] > target ) { 
				mid = (left + right) / 2;
				left = mid - 1;
			} 
			else {
				mid = (left + right) / 2;
				right = mid + 1;
			}
			count++;
		}
		System.out.println("The position is "+targetIndex);
		System.out.println("count "+count);
	}
}
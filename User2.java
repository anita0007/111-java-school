import java.util.Arrays;
public class User2{
	public static void main(String[] args){
        Integer[] iArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int count1=0;
		int count2=0;
        int getIndex = Arrays.asList(iArr).indexOf(2);		//asList() only accept encapsulation
        System.out.println("2 is located at "+getIndex+" index");
		
		
		for(int x = 0;x < iArr.length;x++){				//brute force need search 11 frequency
			if(iArr[x] == 2){
				System.out.println("index is " +x);
			}
			count1++;	
		}
		System.out.println(count1);
		
		
		for(int x = 0;x < iArr.length;x++){				//search <11 frequency ==>8 frequency
			if(iArr[x] == 2){
				System.out.println("index is " +x);
				break;
			}
			count2++;	
		}
		System.out.println(count2);

	}
}

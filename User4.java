public class User4{
	public static void main(String[] args){
		int [] myArr = { 7, 5, 4, 8, 1, 2};
		int max = 0;
		int min = 6;
		float avg = 0;
		int sum = 0;
		int temp;
		int mid = 0;

		for(int i =0 ;i < myArr.length;i++) {
			for (int j = i+1 ;j <= myArr.length-1;j++) {
				temp = myArr[i];
				myArr[i] = myArr[j];
				myArr[i] = temp;			
			}	
			
			if(myArr[i]>max) {    
				max=myArr[i];
			}
			
			if(myArr[i]<min) {    
				min=myArr[i];
			}
			
			sum += myArr[i];
			avg = sum / myArr.length;
			
			mid = (myArr[0] + myArr[myArr.length-1] )/2;
		}

		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		System.out.println(mid);
	}
}
public class Arr2{
	public static void main(String[] args){
		int [] myArr = { 7, 5, 4, 8, 1, 2};
        float avg = 0;
        int [] flag = new int[myArr.length];
        int flag_count = 1;

        int med;
     
        for(int i = 0;i < myArr.length;i++){
            for(int j = 1;j < myArr.length;j++){
                if (flag[i] && flag[j] == 0){
                    avg = (myArr[i] + myArr[j]) / 2 ;     
                }
            } 
            flag[i] = flag_count;
            flag[j] = flag_count;
            flag_count++;
        }
        System.out.println(avg);                     
    }
}
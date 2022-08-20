package Today;

import java.util.Arrays;


public class sumarray {
	public static void main(String args[]) {
		int[] arr = new int[]{1,2,2,3,4};
        int[] arr_new = new int[arr.length-1];
        
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]==arr[i]){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

		

}
}

package Today;

import java.util.Arrays;

public class duplicate {
	private static void duplicate(int[] arr) {
		Arrays.sort(arr);
	    int len = arr.length;
	    int j = 0;
	    for (int i = 0; i < len - 1; i++) {
	    	 if (arr[i] != arr[i + 1]) {
	    		 arr[j++] = arr[i];
	    		 }
	    	 }
	     arr[j++] = arr[len - 1];
	     for (int k = 0; k < j; k++) {
	    	 System.out.print(arr[k] + " ");
        }
     }
	 public static void main(String[] args) {
		 int arr[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7 };
	     duplicate(arr);
	

	
         
     }
}
   


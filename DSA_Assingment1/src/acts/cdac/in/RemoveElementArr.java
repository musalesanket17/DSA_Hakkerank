package acts.cdac.in;

import java.util.Arrays;

public class RemoveElementArr {
     
	 public static void rmelement(int ele,int[] arr) {
		 
		 if(arr.length == 0 )
			 return;
		 
		 int[] arr1 = new int[arr.length-1];
		 
		 for(int i=0,j=0;i<arr.length;i++) {
			 
			 if(ele  == arr[i])
				 continue;
			 
			 arr1[j++] = arr[i];
		 }
		 System.out.println(Arrays.toString(arr1));
  
	 }
	 public static void main(String[] args) {
		
		 int arr[] = new int[] {1,4,3,2,6};
		 rmelement(3,arr);
	}
	 
}


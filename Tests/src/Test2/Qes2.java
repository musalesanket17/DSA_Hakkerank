package Test2;
/*
 * . Program to move all 0's to the end of an array. Maintain the relative order of the other
(non-zero) array elements.
 */
public class Qes2 {
	
	 public static void removeZero(int[] arr) {
		  int count =0;
		   for(int i=0;i<arr.length;i++) {
			 
			   if(arr[i] == 0) {
				   count++;
			   }
			   else {  
				   System.out.print(arr[i]+" ");
			   }
		   }
		   for(int i=1;i<=count ; i++) {
			     
			     System.out.print(0+" ");
		   }
	 }
 
	 public static void main(String[] args) {
		 
		 int arr[] = new int[]{0,0,1,0,2,0,5,0,6};
		 removeZero(arr);
		 
		 
	}

	
}

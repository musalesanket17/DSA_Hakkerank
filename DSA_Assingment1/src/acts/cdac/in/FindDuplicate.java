package acts.cdac.in;

public class FindDuplicate {
     
	 public static void findd(int[] arr) {
		 int i,j;
		 for( i=0;i<arr.length-1;i++) {
			 
			 for(j=i+1;j<arr.length;j++) {
				 
				 if(arr[i] == arr[j]) {
					 
					 System.out.println("Duplicate number is : "+arr[i]);
				 }
			 }
			 
		 }
		 
		 
	 }
	 public static void main(String[] args) {
		 int[] arr = new int[]{1,5,2,1,4,5,2};
		 findd( arr);
	}
}

package acts.cdac.in;

public class FindElement {
 
	 public static int find(int[] arr,int el) {
		 
		 int left =0;
		 int right = arr.length-1;
		 
		 while(left <= right) {
			 
			 int mid = (left+right)/2;
			 
			 if(el == arr[mid]) {
				 return mid;
			 }
			 if(el<arr[mid])
				 right = mid-1;
			 else
				 left = mid+1;
			 
		 }
		 return 0;
		 
	 }
	 public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6};
		 int res = find(arr,3);
		 System.out.println("Find at index : "+res);
	}
}

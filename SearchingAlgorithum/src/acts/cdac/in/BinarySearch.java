package acts.cdac.in;

public class BinarySearch {
 
	 public static int binary(int[] arr,int ele) {
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			  
			int mid = (left+right)/2;
			if(ele == arr[mid]) {
				return mid;
			}
			if(ele<arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return 0;
	 }
	 public static void main(String[] args) {
		
		 int arr[] = new int[] {1,2,3,4,5,6,7,8};
		 int res = binary(arr,6);
		 System.out.println("Found at index "+res);
	}
}

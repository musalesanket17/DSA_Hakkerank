package acts.cdac.in;

public class SecondLarge {

	public static int secondlarge(int[] arr) {
		
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if( arr[i]>arr[j] ) {
					 int temp= arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 return arr[arr.length-2];
	}
	 public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,6,7};
		int res = secondlarge(arr);
		System.out.println("2nd Largest Number is : "+res);
	}
}

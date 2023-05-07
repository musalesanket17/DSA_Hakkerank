package acts.cdac.in;

public class FindSumEqToGivenNumber {

	 public static void main(String[] args) {
		int arr[] = new int[] {2,4,6,7,1,5,9,3,3};
		find(arr,6);
	}

	private static void find(int[] arr, int ele) {
		
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++) {
				   
					if(arr[i]+arr[j]  == ele) {
						
						System.out.println(arr[i]+" + "+arr[j]+" = "+ele);
					}
				}
			}
	}
}

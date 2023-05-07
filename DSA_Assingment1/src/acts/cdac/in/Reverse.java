package acts.cdac.in;

public class Reverse {

	 public static void main(String[] args) {
			int arr[] = new int[] {2,4,6,7,1,5,9,3,3};
			reverse(arr);
	}

	private static void reverse(int[] arr) {
		System.out.print("[ ");

		for(int i=arr.length-1 ;i>=0;i--) {
			System.out.print(+arr[i]+" ");
		}
		System.out.print("]");

	}
}

package acts.cdac.in;

public class TwoDArray {

	 
	public static void main(String[] args) {
		
		 int[][] arr = new int[][] {
			 {1,2,3},
			 {5,6,7},
			 {11,12,13},
			 
		 };
		 
		 
		 
//		 trav(arr);
//		 travNstraigh(arr);
//		 travNulta(arr);
		 
	}
	
	private static void travNulta(int[][] arr) {

		 int n = arr.length;
		 for(int i=0;i<n-1;i++) {
			 System.out.println(arr[i][n-1]);
		 }
		 for(int i=n-1;i>=0;i--) {
			 System.out.println(arr[i][i]);
		 }
		 for(int i = 1;i<n;i++  ) {
			 System.out.println(arr[i][n-3]);
		 }
	}

	private static void travNstraigh(int[][] arr) {
		
		 int n = arr.length;
		 
		 for(int i=n-1;i>0;i--) {
			 System.out.print(arr[i][0]+" ");
		 }
		 for( int i=0;i<n;i++ ) {
			 System.out.print(arr[i][i]+" ");
		 }
		 for(int i=n-2;i>=0;i--) {
			 System.out.print(arr[i][n-1]+" ");
		 }
	}

	private static void trav(int[][] arr) {
		
		 for(int i=0;i<arr[1].length;i++) {
			 for(int j=arr.length-1;j>=0;j--) {
				 
				 System.out.print(arr[j][i]+" ");
				 
			 }
		 }
	}
}

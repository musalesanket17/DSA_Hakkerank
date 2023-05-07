package acts.cdac.in;

public class SearchinTwoDArray {

	public static void main(String[] args) {
		
		  int []arr[] = new int[][] { {10, 20, 30, 40},
                  					  {15, 25, 35, 45},
                  					  {27, 29, 37, 48},
                  					  {32, 33, 39, 50}
                  					};
              find(arr,33);
	}
	public static void find(int[][] arr,int ele) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[1].length;j++) {
				
				if(arr[i][j] == ele) {
					System.out.println("Element found at row no : "+i+" and colum no : "+j);
				}
			}
		}
	}
}

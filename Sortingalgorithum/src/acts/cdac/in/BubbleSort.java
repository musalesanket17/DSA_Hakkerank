package acts.cdac.in;

public class BubbleSort {
    
	public static void bubble(int arr[]) {
		
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1]= temp;
				 }
			 }
		 }
	}
	
	
	 public static void main(String[] args) {
		
		 int arr[] = new int[] {3,6,8,2,1,4};
		 for(int i=0;i<arr.length;i++) {
			    
			   System.out.print(arr[i]+" ");
		   }
		 System.out.println();
		 bubble(arr);
		 for(int i=0;i<arr.length;i++) {
			    
			   System.out.print(arr[i]+" ");
		   }
	}
}

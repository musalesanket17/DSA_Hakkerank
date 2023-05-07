package acts.cdac.in;

public class SelectionSort {

	  public static void selection(int arr[]){
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  for(int j=i+1;j<arr.length;j++) {
				  
				  if(arr[i]>arr[j]) {
					  int temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
				  }
			  }
		  }
		  
		  
	  }
	  public static void main(String[] args) {
		
		   int arr[] = new int[]{222,543,723,335,123,8435};
		   for(int i=0;i<arr.length;i++) {
			    
			   System.out.print(arr[i]+" ");
		   }
		   System.out.println();
		   selection(arr);
		   for(int i=0;i<arr.length;i++) {
			    
			   System.out.print(arr[i]+" ");
		   }
	}
}

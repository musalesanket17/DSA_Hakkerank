package acts.cdac.in;

public class MultipleDuplicate {

	 public static void main(String[] args) {
		 int arr[] = new int[] {1,1,2,1,3,4,5,4,3,4,5,3};
		 
		 for(int i=0;i<arr.length;i++){
			  int count=0 ;
			  for(int j=i+1;j<arr.length;j++) {
				  
				  if(arr[i] == arr[j]) {
					  count++;
				  }
			  }
			  if(count>=2) {
				  System.out.println(arr[i]);
			  }
		 }
	}
}

package acts.cdac.in;
import java.util.*;
public class FindOddTimes {
     static Set<Integer> set= new TreeSet<>();
	public static int find(int arr[]) {
		 int i;
		 
		  for(  i=0;i<arr.length;i++ ) {
			  int count =0 ;
			  for(int j=0;j<arr.length;j++) {
				   if(arr[i] == arr [j]) {
				        count++;
//				   System.out.println(arr[i]+"--"+count);
				   }
			  }
			  if(count%2!=0) {
//				  System.out.println(arr[i]);
				  set.add(arr[i]);
				  }
			  
		  }
		return -1;
		  
	}
	 
	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,2,3,1,5,1,6};
		find(arr);
		System.out.println(set.toString());
	}
}

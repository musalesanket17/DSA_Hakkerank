package acts.cdac.in;
import java.util.*;
public class RemoveDuplicate {
    
	 public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,2,4,3,5,1};
		remove(arr);
	}

	private static void remove(int[] arr) {
		/*
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0;i<arr.length;i++) {
			 set.add(arr[i]);
		}
		System.out.println(set);
		*/
        Arrays.sort(arr);
        int count=0;
		int arr1[] = new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
		
				if(arr[i] != arr[i+1]) {
					arr1[count++] = arr[i];
				}
				
			}
		 for(int i=0;i<arr1.length;i++) {
			  
			 if(arr1[i]!=0) {
				 System.out.println(arr1[i]);
			 }
		 }
			
	}
	
}

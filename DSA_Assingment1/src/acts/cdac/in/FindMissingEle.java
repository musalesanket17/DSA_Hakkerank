package acts.cdac.in;

public class FindMissingEle {

	 public static void find(int[] arr,int n) {
		 int sum=0;
		 int Excepted = n*(n+1)/2;
		 for(int el:arr) {
			 sum+=el;
		 }
		 int res = Excepted  - sum;
		 System.out.println("Missing Number is : "+res);
	 }
	 
	 public static void main(String[] args) {
		 
		 int []arr = new int[] {1,2,3,4,6};
		 find(arr,arr.length+1);
	} 
}

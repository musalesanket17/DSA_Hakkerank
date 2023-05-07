package acts.cdac.in;

public class SmallLarge {
	static int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        public static void sm(int arr[]) {
        	
        	for(int el:arr) {
        		if(el>max) {
        			max = el;
        		}
        		if(el<min) {
        			min = el;
        		}
        	}
        	System.out.println(" Minimum Value is : "+min);
        	System.out.println(" Maximum Value is : "+max);

        }
	 public static void main(String[] args) {
		int arr[] = new int[] {2,3,4,51,7,};
		sm(arr);
	}
}

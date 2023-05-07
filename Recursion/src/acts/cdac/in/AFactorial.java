package acts.cdac.in;

public class AFactorial {
    private static int fact=1;
	 public static int factorial(int i) {
		 
		  if(i>0) {
			  fact *=i;
			  factorial(--i);
			 
		  }
		  return fact;
			  
	 }
	
	public static void main(String[] args) {
		
		     int fact = factorial(5);
		     System.out.println(fact);
	}
}

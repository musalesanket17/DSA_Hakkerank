package acts.cdac.in;

public class AHcf {
      static int res;
	  public static int hcf(int i,int j,int k) {
		  
		  if(i<=j && i<=k) {
			  if(j%i==0 && k%i==0) {
				  res = i;
				  
			  }
			  else {
			     hcf(++i,j,k);
			  }
			  
		  }
		  return res;
	  }
	  public static void main(String[] args) {
		   int i=2;
		   int j=510;
		   int k=92;
		   int res = hcf(i,j,k); 
		   System.out.println(res);
	}
}

package acts.cdac.in;

public class AFiboSeries {
	  
	 private static int b=1,a=0,c=0;
	public static void fibo(int i) {
		
		 if(i>0) {
			 c=a+b;
			 System.out.print(c+"  ");
			 a=b;
			 b=c;
			 fibo(--i);
		 }
	}
	public static void main(String[] args) {
		
		 System.out.print(a+"  "+b+"  ");
		 fibo(10);
	}
}

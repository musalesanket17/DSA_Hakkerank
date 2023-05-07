package acts.cdac.in;


public class Recursion1 {
	
	/*
	public static void fun() {
         int i=9;
		System.out.println("Hii");
		main( null);
	}
	public static void main(String[] args) {
		 
		 fun();
	}
	  
	
	
	public static void fun(int i) {
		

		 if(i<10) {

			  fun(++i);
			  

		 }
		 System.out.println(i);

		  
	}
	public static void main(String[] args) {
		int i=0;
		fun(i);
	}

	public static void fun(int i) {
		 
		 if(i<5) {
			 if(i!=0) {
				 System.out.print(i+"  ");
			 }

			
			 fun(++i);
			 System.out.print(i+"  ");
		 }
		 
	}
	public static void main(String[] args) {
		
		int i=0;
		fun(i);
	}
	
	
	public static void fun(int i) {
		if(i<6) {
		for(int x=0;x<i;x++)
			System.out.print("* ");
		System.out.println();
		}
		if(i<5) {
		 fun(++i);	
		 for(int x=0;x<i;x++)
			System.out.print("* ");
		System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		 
		int i=0;
		fun(i);
	}
	*/
	public static void fun(int i) {
		System.out.println(2*i+"  ");
		if(i<10) {
			fun(++i);
		}
	}
	public static void main(String[] args) {
		int i;
//		fun(i);
		 for( i=0;i<5;i++) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 System.out.println(i);
	}
}



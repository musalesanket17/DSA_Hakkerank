package acts.cdac.in;

public class TowerOfHanoi {
	
	public static void toh(int i , String s,String d ,String h) {
		
		if(i>0) {
			
			 toh(i-1,s,h,d);
			 System.out.println("Disc "+i+" Moved from "+s+" to "+d);
			 toh(i-1,h,d,s);
		}
		else {
			return ;
		}
		
	}
	public static void main(String[] args) {
		
		 toh(2,"Source","Destination","Helper");
	}
}

package acts.cdac.in;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class HashTable {
	

	 
	 public static void main(String[] args) {
		
		 Dictionary<Integer,String> d= gethashatble();
//		 printhashtablekeys(d);
//		 getenteries(d);
//		 printhashtableValues(d);
//		 getvaluewithkey(d,2);
		 removewithkey(d,2);
		 
		 
		 
	}
	 public static void removewithkey(Dictionary<Integer,String> d,int id ) {
		 
		   String str= d.remove(id);
		   System.out.println("Removed "+id+" "+str );
	 }
	public static void getvaluewithkey( Dictionary<Integer,String> d ,int id) {
		
		String value = d.get(id);
		System.out.println(id+" "+value);
	}

	 public static void printhashtableValues(Dictionary<Integer,String> d) {
		  
		     Enumeration<String> ele = d.elements();
		     String str = null;
		     while(ele.hasMoreElements()) {
		    	 str = ele.nextElement();
		    	 System.out.println(str);
		     }
	 }

	
	private static void getenteries(Dictionary<Integer, String> d) {
		    
		System.out.println(d.size());
		
	}


	private static void printhashtablekeys(Dictionary<Integer, String> d) {
		
		   Enumeration<Integer> keys = d.keys();
		   Integer i = null;
		   while(keys.hasMoreElements()) {
			   i  = keys.nextElement();
			   System.out.println(i);
		   }
		
	}


	private static Dictionary<Integer, String> gethashatble() {
		 Dictionary<Integer,String> d= new Hashtable<>();
         d.put(1, "sanket");
         d.put(2, "vishal");
         d.put(3, "Surya");
		
		 return d;
	}
}


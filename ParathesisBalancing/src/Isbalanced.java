import java.util.*;

public class Isbalanced {
	 public static void main(String[] args) {
		 String str ="(5+12[12]-{42})";
		 System.out.println( isbalance(str));
	}
	private static boolean isbalance(String str) {	
		String open = "({[";
		String close  =")}]";
		List<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) { 
			 if(open.indexOf(str.charAt(i)) != -1) {
				 ((Stack<Character>) st).push(str.charAt(i));
			 }
			 else if(close.indexOf(str.charAt(i))!= -1) {
				 
				 if(st.isEmpty()) {
					 return false;
				 }
				 
				 char pop = ((Stack<Character>) st).pop();
				 
				 if(open.indexOf(pop) != close.indexOf(str.charAt(i))){  
					 return false;
				 }
			 }
		}
		return st.isEmpty();
	}
}

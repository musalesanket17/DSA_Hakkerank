package acts.cdac.in;

public class FindInitials {

	 public static void findini(String str) {
		 
		 String[] w = str.split(" ");
		 
		 for(String el:w) {
			 System.out.print(el.charAt(0)+" ");
		 }
		 
	 }
	 public static void main(String[] args) {
		 String str = "Kabhi Haa Kabhi Naa";
		 findini(str);
		 
	}
}

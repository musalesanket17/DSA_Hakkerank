package acts.cdac.in;

public class RemoveAllPunctuation {

	
	 public static void main(String[] args) {
		
		 String str = "%welcome' to @cdacmumbai?<s";
		 str= str.replaceAll("\\p{Punct}","");
		 System.out.println(str);
	}
}

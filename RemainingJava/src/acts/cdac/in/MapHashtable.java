package acts.cdac.in;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
public class MapHashtable {

	 
	public static void main(String[] args) {
		Map<Integer,String> map=getmaphashtable();
//		System.out.println(map.size());
//		getAllkeys(map);
//		getmapvalues(map);
//		printAlltable(map);
		getvaluewithkey(map,2);
	}
 
	private static void getvaluewithkey(Map<Integer, String> map,int id) {
        
		if(map.containsKey(id)) {
		String str=map.get(id);
		System.out.println(str);
		}
		 
	}

	private static void printAlltable(Map<Integer, String> map) {
            
		Set<Entry<Integer, String>> set = map.entrySet();
	    for(Entry<Integer, String> ele : set) {
	    	System.out.println(ele.getValue());
	    	System.out.println(ele.getKey());
	    }
		
	}

	private static void getmapvalues(Map<Integer, String> map) {
         
		   Collection<String> str = map.values();
			str.forEach(el->System.out.println(el));

	}

	public static void getAllkeys(Map<Integer,String> map) {
		
		Set<Integer> set = map.keySet();
		set.forEach(el->System.out.println(el));
	}
	
	private static Map<Integer, String> getmaphashtable() {
		Map<Integer,String> map = new Hashtable<>();
		map.put(1, "sanket");
		map.put(2, "Vishal");
		map.put(3, "Surya");
		map.put(2, "OOPS");		
		return map;
	}
}

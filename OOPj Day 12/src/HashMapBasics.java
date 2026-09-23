import java.util.*;
import java.util.Map.Entry;


public class HashMapBasics {

	public static void main(String[] args) {
		
		Map<String, String> mapping = new HashMap<>();

		//insertion
		
		mapping.put("in", "India");
		mapping.put("us", "United States");
//		mapping.put("uae", "Dubai");
		mapping.put("fa", "France");
		
		System.out.println(mapping);
		
		mapping.putIfAbsent("uae", "Dubai");
		System.out.println(mapping);
		System.out.println();
		
		System.out.println("Before Replacing: "+ mapping);
		mapping.replace("fa", "french");
		System.out.println("After Replacing: "+ mapping);
		
		System.out.println();
		System.out.println(mapping.get("in"));
		System.out.println(mapping.containsKey("in"));
		System.out.println(mapping.containsValue("in"));
		System.out.println();
		
		System.out.println("Before Removing: "+ mapping);
		mapping.remove("fa");
		System.out.println("After Rmoving: "+ mapping);
		
		System.out.println();
		System.out.println("All keys present in mapping: "+ mapping.keySet());
		System.out.println("All Values present in mapping: "+ mapping.values());
		System.out.println(mapping.entrySet());
		
		
		//map Iterator
		Iterator<Map.Entry<String, String>> itr = mapping.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			
			System.out.print(entry.getKey()+ " " + entry.getValue() + " ");
		}
		System.out.println();
		System.out.println();
		//map enhanced for loop
		for (Entry<String, String> entry : mapping.entrySet()) {

		    System.out.print(entry.getKey() + " ");
		    System.out.println(entry.getValue());
		}
	}

}

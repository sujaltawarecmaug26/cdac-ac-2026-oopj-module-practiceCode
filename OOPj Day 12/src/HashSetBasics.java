import java.util.*;

public class HashSetBasics {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		//Set contains unique elements(not allowed duplicates)
		set.add(3);
		set.add(3);
		set.add(10);
		set.add(6);
		set.add(1);

		//adding element in the Set2
		set2.add(100);
		set2.add(3);
		set2.add(90);
		set2.add(1);
		
		
		System.out.println("Original Set Elements: "+set);
		System.out.println("Original Set2 Elements: "+set2);
		System.out.println();
		//perform some specific methods of HashSet
		
		
//reatainAll()-> retains all elements in the set that are also present in another set(i.e set2)
		System.out.println("Original Set Elements: "+set);
		set.retainAll(set2);
		System.out.println("After retain Set Elements: "+set);
		System.out.println();
		
		
//containsAll -> it returns ture if all set elements present in the set2 
		System.out.println(set.containsAll(set2)); //false
		System.out.println();
		
		Set<Integer> set3 = new LinkedHashSet<>();
		
		set3.add(17);
		set3.add(15);
		set3.add(11);
		set3.add(10);
		
		System.out.println("Original List: "+set3);
		
		set3.remove(15);
		set3.add(15);
		
		System.out.println("List after adding again: "+set3);
	}

}

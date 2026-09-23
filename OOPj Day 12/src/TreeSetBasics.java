import java.util.*;

public class TreeSetBasics {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> set = new TreeSet<>();
		//Set contains unique elements(not allowed duplicates)
		set.add(3);
		set.add(3);
		set.add(10);
		set.add(6);
		set.add(1);		
		
		System.out.println("Original Set Elements: "+set);

		System.out.println();
		
		
		
		//perform some specific methods of HashSet
		
		
//descendingSet()-> This method returns a reverse order view of the elements contained in this set.
		System.out.println("Original Set Elements: "+set);
		set.descendingSet();
		System.out.println("After Descending Elements: "+set);
		System.out.println();
		
		
//contains -> it returns ture if given  element is present 
		System.out.println(set.contains(7)); //false
		System.out.println();
		
		
		
		System.out.println("Original Set Elements: "+set);
		System.out.println("First Elements of TreeSet: "+set.first());
		System.out.println("Last Elements of TreeSet: "+set.last());
		
		System.out.println();
		System.out.println("Original Set Elements: "+set);
		System.out.println("FElements of TreeSet: "+set.ceiling(5));
		System.out.println("Elements of TreeSet: "+set.floor(5));
		
	}

}

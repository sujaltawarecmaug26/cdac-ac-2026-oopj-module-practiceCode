import java.util.*;


public class ListClass {

	public static void main(String[] args) {
		
		// Creating a List of Integer using ArrayList
		List<Integer> list = new ArrayList<>();
		
		//performing common methods on list
		
		//adding integer elements in list
		list.add(10);
		list.add(15);
		list.add(100);
		list.add(9);
		list.add(69);
		list.add(1,20);// This method is used to add an element at a specific index.
		System.out.println(list); //[10,20,15]
		
		// Setting (updating) element at 1st index using set() method
		list.set(0, 07);
		System.out.println(list); //[07,20,15]
		
		// use indexOf() to find the first occurrence of an element in the list
		System.out.println(list.indexOf(20)); //2
		System.out.println(list.indexOf(2)); //returns -1 if the element is not found
		
		// use lastIndexOf() to find the last occurrence of an element in the list
		System.out.println(list.lastIndexOf(07));
		
		//accessing elements using get() method
		System.out.println(list.get(0)); //o/p -> 7
		
		 // Checking if element is present using contains() method
        boolean isPresent = list.contains(20);
        System.out.println( isPresent);
        
        System.out.println();
        
        // Using for-each loop for iteration
		for(int num : list) {
			System.out.print(num +" ");
		}
		System.out.println();
		
		
		//traversal list elements using iterator();
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Elements: "+ iterator.next());
		}
		
		//sorting list using sort()->In Ascending Order
		System.out.println("List Before Sort in Asc: " + list);
		Collections.sort(list);
		System.out.println("List After Sort Asc: " + list);
		
		System.out.println();
		
		//sorting list using sort()->In Descending Order
		System.out.println("List Before Sort in Desc: " + list);
		Collections.reverse(list);
		System.out.println("List After Sort n Desc: " + list);
		
		System.out.println();
		
		System.out.println("Before removing: "+list);
		//removing integer from list
		list.remove(0); // it removes element at 0 index i.e 10;
		System.out.println("After removing: "+list); //[20,15]
		
		System.out.println();
		
		
		//clone list using clone() method
		ArrayList<Integer> Clonelist = (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
		
		System.out.println("CloneList: " + Clonelist);
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(list.size()); //2
		list.clear(); //it clear all elements from list
		
		System.out.println(list); //size is 0;
	}

}

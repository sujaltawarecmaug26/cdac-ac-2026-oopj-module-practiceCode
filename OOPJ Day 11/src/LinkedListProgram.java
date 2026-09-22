import java.util.*;



public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(100);
		list.add(50);
		list.add(20);
		list.add(110);
		
		System.out.println(list);
		System.out.println("First element of list: " + list.getFirst());
		System.out.println("Last element of list: " + list.getLast());
		list.addFirst(77);
		System.out.println("After adding First element of list: " + list);
		
		//it returns head element(first element)  of linked list
		System.out.println(list.peek());
		
		//it returns and remove first element from the linked list   
		System.out.println(list.poll());
		System.out.println(list);
		
		//add specified element at the end of linked list
		System.out.println("Original list: " + list);
		list.offer(999);
		System.out.println("After method used: " + list);
		
		//Note -> Linked is not allowed to clone his list using clone() method
	}

}

import java.util.*;


public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(15);
		stack.push(44);
		stack.push(9);
		
		
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
		
		
	System.out.println("Is Stack empty: " + stack.empty());
	System.out.println(stack.search(44));	
		
	stack.remove(1);
	System.out.println(stack);
	
	Iterator<Integer> iterator = stack.iterator();
		
	while(iterator.hasNext()) {
		System.out.print(iterator.next() +  " ");
	}
	System.out.println();
	

	System.out.println(stack.peek());
	
	
	 Deque<String> d = new ArrayDeque<String>();

     // add() method to insert
     d.add(" Sujal");
     d.addFirst("EveryOne!");
     d.addLast("Taware");

     // offer() method to insert
     d.offer("This");
     d.offerFirst("Hello");
     d.offerLast("Side");

     System.out.println("ArrayDeque : " + d);
     
     System.out.println(d.peek());
     System.out.println("ArrayDeque : " + d);
     
     System.out.println();
     
     // Iterate using Iterator interface from the front of the queue
     System.out.println("Iterating in ForwardOrder:");
     for (Iterator<String> i = d.iterator(); i.hasNext();) {

         System.out.print(i.next() + " ");
     }

     System.out.println();
     System.out.println();

     // Iterate in reverse sequence in a queue
     System.out.println("Iterating in ReverseOrder:");
     for (Iterator<String> i = d.descendingIterator();
          i.hasNext();) {

         System.out.print(i.next() + " ");
     }
	}

}

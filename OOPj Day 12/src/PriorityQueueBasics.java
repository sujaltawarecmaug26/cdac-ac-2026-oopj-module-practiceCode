import java.util.*;


public class PriorityQueueBasics {

	public static void main(String[] args) {
		//Ingeter->less Value has -> high priority
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // default behavior
		
		
		//Ingeter->high Value has -> high priority -> follows maxHeap dataStructure.
//		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a); //comparator behavior
	
		pq.add(10);
		pq.add(2);
		pq.add(100);
		pq.add(20);
		
		System.out.println("Original: "+pq);
		
		pq.poll();
		System.out.println("After removing elements: "+pq);
		
		System.out.println();
		
		System.out.println("Is Element Present :" + pq.contains(2));
		
		System.out.println();
		
		 Iterator<Integer> iterator = pq.iterator();

	        while (iterator.hasNext()) {
	            System.out.print("Elements: "+iterator.next() + " ");
	        }
	        
	        System.out.println();
	        
	        System.out.println();
		 PriorityQueue<String> strPQ = new PriorityQueue<>();
		 
		 strPQ.add("D");
		 strPQ.add("Y");
		 strPQ.add("B");
		 strPQ.add("A");
		 
		 System.out.println("Original PQ: "+ strPQ);
		 System.out.println(strPQ.poll());
		 System.out.println("Modify PQ: " + strPQ);
		 
	}

}

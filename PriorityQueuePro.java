package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueuePro {
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(123);
		pq.add(20);
		pq.add(23);
		pq.add(20);
		System.out.println(pq);
		
		Iterator i1 =pq.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		} 
			
		PriorityQueue pq2 = new PriorityQueue();
		pq2.add(23);
		pq2.add(32323);
		pq2.add(11);
		pq2.add(33);
		System.out.println(pq2);
	}

}


package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add(232);
		a1.add(12);
		a1.add("rohit");
		a1.add(null);
		a1.add(null);
		a1.add("rohit");
		System.out.println(a1);
	
		
		Iterator i1 =a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		ListIterator l22=a1.listIterator();
		
		while(l22.hasNext()) {
			System.out.println(l22.next());
		}
		
		while(l22.hasPrevious()) {
			System.out.println(l22.previous());
		}
		
		
		ArrayList a2 = new ArrayList();
		
		a2.add(23);
		a2.add(32323);
		a2.add(11);
		a2.add(33);
		Collections.sort(a2);
		System.out.println(a2);
	}

}

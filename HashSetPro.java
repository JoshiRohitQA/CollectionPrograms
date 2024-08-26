package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetPro {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(23);
		hs.add(232);
		hs.add(12);
		hs.add("rohit");
		hs.add(null);
		hs.add(null);
		hs.add("rohit");
		System.out.println(hs);
		
		Iterator i1 =hs.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		} 
		
		
		
		HashSet hs2 = new HashSet();
		hs2.add(23);
		hs2.add(32323);
		hs2.add(11);
		hs2.add(33);
		System.out.println(hs2);
		
	}
}

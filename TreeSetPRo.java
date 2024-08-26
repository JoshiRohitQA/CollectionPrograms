package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetPRo {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(23);
		ts.add(232);
		ts.add(12);
	//	ts.add("rohit");
	//	ts.add(null);
	//	ts.add(null);
	//	ts.add("rohit");
		System.out.println(ts);
		
		Iterator i1 =ts.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		} 
		
		
		TreeSet ts2 = new TreeSet();
		ts2.add(23);
		ts2.add(32323);
		ts2.add(11);
		ts2.add(33);
		System.out.println(ts2);
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPro {
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
	
		v1.add(23);
		v1.add(232);
		v1.add(12);
		v1.add("rohit");
		v1.add(null);
		v1.add(null);
		v1.add("rohit");
		System.out.println(v1);
		
		Iterator i1 =v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		ListIterator l22=v1.listIterator();
		
		while(l22.hasNext()) {
			System.out.println(l22.next());
		}
		
		while(l22.hasPrevious()) {
			System.out.println(l22.previous());
		} 
		
		
		Vector v2 = new Vector();
		
		v2.add(23);
		v2.add(32323);
		v2.add(11);
		v2.add(33);
		Collections.sort(v2);
		System.out.println(v2);
		
		Enumeration e1 = v2.elements();
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
	}
		
	

}

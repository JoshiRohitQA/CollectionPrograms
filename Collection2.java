package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Collection2 {
	
	public static void main(String[] args) {
		
		Collection c1 =new ArrayList();
		c1.add("Rohit");
		c1.add("testing");
		c1.add(75);
		c1.add(false);
		c1.add(9.32);
		System.out.println(c1);
		
		Collection c2 =new ArrayList();
		c2.addAll(c1);
		c2.add("Rice");
		c2.add("Sugar");
		
		
		System.out.println(c2);
		
		
		Iterator i1 = c1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		System.out.println(c1.size());
		
		System.out.println(c1.contains("manish"));
		
		boolean con= c2.containsAll(c1);
		
		System.out.println(con);
		
		

		
	}

}

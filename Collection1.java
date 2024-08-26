package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection1 {
	
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
		
		boolean res=c2.equals(c1);
		System.out.println(res);
		
		boolean res1=c1.isEmpty();
		System.out.println(res1);
		
		/*
		 * c1.clear(); System.out.println(c1);
		 */
		
		
		c1.remove(75);
		System.out.println(c1);
		
		
		c2.removeAll(c1);
		System.out.println(c2);
		
		
		
	}

}

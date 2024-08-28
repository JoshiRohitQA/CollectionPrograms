package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class StackPro {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.add(23);
		s1.add(232);
		s1.add(12);
		s1.add("rohit");
		s1.add(null);
		s1.add(null);
		s1.add("rohit");
		System.out.println(s1);
		
		Iterator i1 =s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		} 
		
		ListIterator l22=s1.listIterator();
		
		while(l22.hasNext()) {
			System.out.println(l22.next());
		}
		
		while(l22.hasPrevious()) {
			System.out.println(l22.previous());
		} 
		
		
		
		Stack s2 = new Stack();
		s2.add(23);
		s2.add(32323);
		s2.add(11);
		s2.add(33);
		//Collections.sort(s2);
		System.out.println(s2);
		System.out.println(s2.peek());
		s2.push(222);
		System.out.println(s2);
		System.out.println(s2.pop());
		System.out.println(s2);
		
		
		
	}

}

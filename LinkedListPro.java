package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPro {
	public static void main(String[] args) {
		LinkedList lk = new LinkedList();
		
		lk.add(23);
		lk.add(232);
		lk.add(12);
		lk.add("rohit");
		lk.add(null);
		lk.add(null);
		lk.add("rohit");
		System.out.println(lk);
		
		Iterator i1 =lk.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		ListIterator l11=lk.listIterator();
		
		while(l11.hasNext()) {
			System.out.println(l11.next());
		}
		
		while(l11.hasPrevious()) {
			System.out.println(l11.previous());
		} 
		
		
		LinkedList lk2= new LinkedList();
		lk2.add(23);
		lk2.add(32323);
		lk2.add(11);
		lk2.add(33);
		Collections.sort(lk2);
		System.out.println(lk2);
		
		
		
	
  }
		
	

 }

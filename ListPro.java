package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPro {
	
	public static void main(String[] args) {
		
		List l1 =new ArrayList();
		l1.add(98);
		l1.add(63);
		l1.add(0);
		l1.add(35);
		l1.add(875);
		l1.add(342);
		l1.add(342);
		l1.add(342);
		Collections.sort(l1);
		
		System.out.println(l1);
		
	Iterator i2=l1.iterator();
	
	//Forward iteration
	while(i2.hasNext()) {
		System.out.println(i2.next());
		
		
	}
		
	
	ListIterator l3=l1.listIterator();
	
	System.out.println("Forward iteration using listIterator");
		while(l3.hasNext()) {
			System.out.println(l3.next());
			
			
		}
		
		
		System.out.println("Backward iteration using listIterator");
		
				while(l3.hasPrevious()) {
					System.out.println(l3.previous());
					
					
				}
	
	}

}

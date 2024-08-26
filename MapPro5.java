package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPro5 {
	public static void main(String[] args) {
		Map<String,Integer>m2=new HashMap<String,Integer>();
		m2.put("Rohit", 100);
		m2.put("Atul", 98);
		m2.put("Sandeep",97);
		System.out.println(m2);
		
		Set<String>s1=m2.keySet();
		System.out.println(s1);
		
		for(String s2:m2.keySet()) 
		{
			System.out.println(s2);
		}
		
		for(Integer i1: m2.values()) {
			System.out.println(i1);
		}
		
		for(Entry<String,Integer>e1: m2.entrySet()) {
			
			System.out.println(e1);
		}
		
		Iterator<Entry<String,Integer>> i3= m2.entrySet().iterator();
		
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		
	
	}

}

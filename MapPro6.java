package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapPro6 {
	public static void main(String[] args) {
		Map<Integer,Double>m1=new HashMap<Integer,Double>();
		m1.put(2132, 232.23);
		m1.put(1123, 232.32);
		m1.put(12323, 323.32);
		m1.put(4343, 323.32);
		
		for(Integer i1:m1.keySet()) {
			System.out.println(i1);
		}
		
		for(Double d1:m1.values()) {
			System.out.println(d1);
		}
		
		for(Entry<Integer,Double>e1:m1.entrySet()) {
			System.out.println("Employee id and Salay is-> " + e1);
		}
		
	Iterator<Entry<Integer,Double>> i2 =m1.entrySet().iterator();
	
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	
		
	}

}

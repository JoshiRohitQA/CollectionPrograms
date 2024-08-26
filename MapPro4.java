package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPro4 {
	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mohan", 93);
		m1.put("Vinod", 74);
		m1.put("Hari", 23);
		System.out.println(m1);
	/*	m1.remove("Vinod");
		System.out.println(m1);
		m1.remove("Hari", 23);
		System.out.println(m1);
		*/
		
		m1.replace("Mohan", 99);
		System.out.println(m1);
		
		m1.replace("Hari", 23,33 );
		System.out.println(m1);
		
		
		Map<String,Integer> m2 = new HashMap<String, Integer>();
		m2.put("Rohit", 100);
		m2.put("Atul", 98);
		m2.put("Sandeep",97);
		
		
		
	}

}

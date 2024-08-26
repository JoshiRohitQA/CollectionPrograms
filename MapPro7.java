package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPro7 {
	public static void main(String[] args) {
		Map<Integer,Double>m1=new HashMap<Integer,Double>();
		m1.put(2132, 232.23);
		m1.put(1123, 232.32);
		m1.put(12323, 323.32);
		m1.put(4343, 323.32);
		m1.putIfAbsent(23, 100.23);
		System.out.println(m1);
	}
	
	

}

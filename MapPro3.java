package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPro3 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m1 =new HashMap<String,Integer>();  
		m1.put("Rice", 90);
		m1.put("Sugar", 32);
		m1.put("Oil", 322);
		m1.put("Salt", 12);
		System.out.println(m1);
	//	m1.clear();
	//	System.out.println(m1);
		boolean b1=m1.isEmpty();
		System.out.println(b1);
		boolean b2=m1.containsKey("Rice");
		System.out.println(b2);
		boolean b3=m1.containsValue(12);
		System.out.println(b3);
		
		
		Map<String, Integer> m2 =new HashMap<String,Integer>();  
		m2.putAll(m1);
		m2.put("ToothPaste", 232);
		System.out.println(m2);
		
		boolean b4=m2.equals(m1);
		System.out.println(b4);
		
		if(m1.size()==m2.size()) {
			System.out.println("size of both are same");
		}
		else {
			System.out.println("both are not same");
		}
		
	}

}

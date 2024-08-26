package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPro2 {
	public static void main(String[] args) {
		

		Map<String, Integer> m1 =new HashMap<String,Integer>();  // here only wrapper classes like Integer
		m1.put("Rice", 90);
		m1.put("Sugar", 32);
		m1.put("Oil", 322);
		m1.put("Salt", 12);
		System.out.println(m1);
	}

}

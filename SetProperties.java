package collection;

import java.util.HashSet;
import java.util.Set;

public class SetProperties {
	
	public static void main(String[] args) {
		
		Set s1=new HashSet();
		s1.add("ramaya");
		s1.add("swati");
		s1.add("rohit");
		s1.add("sandeep");
		s1.add("sandeep");
		s1.add(null);
		s1.add(null);
		s1.add(23232);
		s1.add(32);
		s1.add('s');
		System.out.println(s1);
		
	}

}

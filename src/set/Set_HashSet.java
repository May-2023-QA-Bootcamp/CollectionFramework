package set;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		
		//creating obj
		Set<String> s=new HashSet<>();
		//adding elements
		s.add("Mehdi"); //when we call add()---it will call put()---which will hashCode() as saw in hashMap	}
		s.add("Mehdi");//duplicate will be skipped
		s.add("Sohag");
		s.add("Mamun");
		s.add("Ruksana");
		s.add(null);//one null is possible
		s.add(null);//duplicate will be skipped
		//printing obj
		System.out.println(s);
		

	}

}

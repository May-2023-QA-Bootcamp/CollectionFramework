package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<>();
		s.add("Mehdi"); //when we call add()---it will call put()---which will hashCode() as saw in hashMap	}
		s.add("Mehdi");//duplicate will be skipped
		s.add("Sohag");
		s.add("Mamun");
		s.add("Ruksana");
		
		System.out.println(s);
		
		
		
		//checing insertion order while retriving
		
		Iterator<String> i=s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
			
			
		}

	}

}

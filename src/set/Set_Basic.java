package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Basic {

	public static void main(String[] args) {
		// Why need set
		//you need to store only unique objects/data/element
		
		
		//creating obj
		Set<String> s=new HashSet<>();
		//adding elements
		s.add("Mehdi"); //when we call add()---it will call put()---which will hashCode() as saw in hashMap	}
		s.add("Mehdi");//will be skipped
		s.add("Sohag");
		s.add("Mamun");
		s.add("Ruksana");
		s.add("Shanini");
		s.add("Abir");
		//size
		System.out.println(s.size());
		//checking specific element is there or not
		System.out.println(s.contains("Mehdi"));
		//removing after checking
		if(s.contains("Mehdi")) {
			s.remove("Mehdi");
		}else {
			System.out.println("It is not there...so no need to remove");
		}
		
		
		//getting all elements by iterator()
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
	
		}
		
		System.out.println(s.size());//5
		
		//creating another set
		Set<String> s1=new HashSet<>();
		s.add("Mehdi"); //when we call add()---it will call put()---which will hashCode() as saw in hashMap	}
		s.add("Sohag");
		
		//adding in prev collection
		s.addAll(s1);
		//now the the size
		System.out.println(s.size());//6
}
}
package set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


//TreeSet----retriving data in sorted way

public class Set_SortedSet_TreeSet {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet=new TreeSet<>();
		sortedSet.add(500);
		sortedSet.add(100);
		sortedSet.add(300);
		sortedSet.add(200);
		sortedSet.add(400);

		//priting the obj 
		System.out.println(sortedSet);
		//getting all element using iterator()
		Iterator<Integer> i=sortedSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

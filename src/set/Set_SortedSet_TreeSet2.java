package set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_SortedSet_TreeSet2 {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet=new TreeSet<>();
		sortedSet.add(500);
		sortedSet.add(100);
		sortedSet.add(300);
		sortedSet.add(200);
		sortedSet.add(400);
		
		
		
		System.out.println(sortedSet.first());//it will return first element (after sorting)
		System.out.println(sortedSet.last());//it will return last element (after sorting)
		System.out.println(sortedSet.headSet(400));//will return a set of obj which are before mentioned obj
		System.out.println(sortedSet.tailSet(400));//will return a set of obj which are after mentioned obj

		
		System.out.println(sortedSet);
		Iterator<Integer> i=sortedSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

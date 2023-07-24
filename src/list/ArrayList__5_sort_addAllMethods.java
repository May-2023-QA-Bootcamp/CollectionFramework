package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList__5_sort_addAllMethods {

	public static void main(String[] args) {
		//Creating obj of arrayList
		ArrayList<Integer> araylist = new ArrayList(); 
		//add elements
		araylist.add(1010);
		araylist.add(0,1000); //to add at specific index
		araylist.add(102);
		araylist.add(110);
		araylist.add(110);
		araylist.add(10);
		
		//element at index  0
		System.out.println(araylist.get(0));
		//removing specific element-----
		araylist.remove(0);
		//after removing now value at index 0
		System.out.println(araylist.get(0));
		
		//sorting the list--using sort() method from Collections class
		Collections.sort(araylist);
		//after sorting at index 0 value should be lowest one
		System.out.println(araylist.get(0));

		
		//print all elements 
		Iterator<Integer> i = araylist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		
		//creating another obj of arrayList--to add all elements from prev collection
		ArrayList<Integer> araylist2 = new ArrayList();
		araylist2.add(500);
		araylist2.add(501);
		//calling addAll() to add all elements from prev collection
		araylist2.addAll(1, araylist);
		
		//print elements after adding all
		Iterator<Integer> it = araylist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
		//to make list empty we can call clear method
		araylist.clear();
		System.out.println("after clear****************");
		Iterator<Integer> it1 = araylist.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}

	}

}

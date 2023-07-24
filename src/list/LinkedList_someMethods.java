package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_someMethods {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(70);

		System.out.println("//check elements at specific index ------");
		System.out.println(list.get(0));
		
		System.out.println("//add elements with index in add() method -----");
		list.add(0, 80);
		System.out.println(list.get(0));
		
		
		System.out.println("//we can also add element at first/at last -----");
		list.addFirst(66);
		list.addLast(77);
		
		System.out.println("//get first/last element-----");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("//get the first element with peek() method-----");
		System.out.println(list.peek());
		
		
		//cloning
		LinkedList<Integer> list2=(LinkedList) list.clone();
		
		
		System.out.println("Print all elements using iterator-----");
		Iterator<Integer> i=list2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}

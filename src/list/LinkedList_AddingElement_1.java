package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_AddingElement_1 {

	public static void main(String[] args) {
		//creating LinkedList obj
		LinkedList<Integer> list=new LinkedList<>();
		
		//adding elements
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(70);
		
		//print all elements
		System.out.println("using for loop----");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("using  each loop----");
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("using iterator----");
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}

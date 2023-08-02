package list;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Basic {

	public static void main(String[] args) {
		// creating obj of Vector
		Vector<Integer> v1 = new Vector();
		v1.add(500);

		Vector<Integer> v = new Vector(); // when we create obj with default constructor--capacity=10
		// adding elements
		v.add(101);
		v.add(105);
		v.add(100);
		v.add(101);// duplicate is possible
		v.add(10);
		v.add(70);
		v.add(1010);
		v.add(18800);
		v.add(120);
		v.add(1090);
		

		v.addAll(v1);
		System.out.println("when we have upto 10 elements-----------");
		// checking capacity
		System.out.println("capacity-" + v.capacity());// 10
		System.out.println("total elements-" + v.size()); // 10 is for elements

		v.add(1070);
		v.addElement(1);
		
		System.out.println("get first element"+v.firstElement());

		// checking capacity
		System.out.println("After adding 11th element-----------");
		System.out.println("capacity-" + v.capacity()); // 20
		System.out.println("total elements-" + v.size()); // 11

		System.out.println("After remove 11th element-----------");
		//v.remove(10);

		System.out.println("capacity-" + v.capacity()); // 10
		System.out.println("total elements-" + v.size()); // 10
		// checking after clear if we try to retrive element-----for each loop
		for (int i : v) {
			System.out.println(i);
		}
		//to removeAll() you need to pass a collection
		v.removeAll(v1);
		// v.clear();
		
		for (int j : v) {
			System.out.println(j);
		}
		

		System.out.println("After clear-----------");

		System.out.println("capacity-" + v.capacity()); // 20
		System.out.println("total elements-" + v.size()); // 0

		// printing all elementt
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

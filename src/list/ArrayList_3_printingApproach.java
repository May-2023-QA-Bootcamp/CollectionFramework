package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3_printingApproach {

	public static void main(String[] args) {

		ArrayList araylist = new ArrayList(); // 10 initial capacity when you call default constructor

		araylist.add(101); // Integer
		araylist.add(102.1);// Double
		araylist.add(110);
		araylist.add(110);// duplicate
		araylist.add(110);
		araylist.add(110);
		araylist.add("Sohag");// String
		
		
		System.out.println(araylist);
		
		
		//pringing one data
		
		//System.out.println(araylist.get(1));
		
		//pringing all data
		
		//for loop
		
		for(int i=0;i<7;i++) {
			System.out.println(araylist.get(i));
		}

		//for each/enhance/advanced loop
		ArrayList<Integer> araylist1 = new ArrayList<>();
		// Generic-Integer type
		araylist1.add(101); // Integer
		araylist1.add(102);
		araylist1.add(110);
		araylist1.add(110);
		
		for(int j:araylist1) {
			System.out.println(j);
		}
		
		//using iterator()
		
		Iterator<Integer> i=araylist1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		//using forEach()-----in iterable interface
		
		
		
	


	}

}

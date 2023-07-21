package list;

import java.util.ArrayList;

public class ArrayList_2_GenericOrHetorogenious {

	public static void main(String[] args) {

		// we can have Hetrogenious data or make it Generic
		// arraylist-1 // Hetrogenious type
		ArrayList araylist = new ArrayList(); // 10 initial capacity when you call default constructor
		araylist.add(101); // Integer
		araylist.add(102.1);// Double
		araylist.add(110);
		araylist.add(110);// duplicate
		araylist.add(110);
		araylist.add(110);
		araylist.add("Sohag");// String

		// arraylist-2--generic
		ArrayList<Integer> araylist1 = new ArrayList<>();
		// Generic-Integer type
		araylist1.add(101); // Integer
		araylist1.add(102);
		araylist1.add(110);
		araylist1.add(110);

		// arraylist-3--generic
		ArrayList<String> araylist2 = new ArrayList<String>();
		// Generic-String 
		araylist2.add("Mehdi"); // Integer
		araylist2.add("Shabnin");// Double
		araylist2.add("Rash");
		araylist2.add("Tanvir");// duplicate

	}

}

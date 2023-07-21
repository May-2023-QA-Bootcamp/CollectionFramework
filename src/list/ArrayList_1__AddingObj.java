package list;

import java.util.ArrayList;

public class ArrayList_1__AddingObj {

	public static void main(String[] args) {

		// how we store data--------------

		// in variable
		int id = 101;

		// in Array
		int ids[] = new int[5]; // 0 1 2 3 4

		ids[0] = 101;
		ids[1] = 107;
		ids[2] = 108;
		ids[3] = 100;
		ids[4] = 106;
		// ids[5]=102;

		// pring variable value
		System.out.println(id); // 101
		// print index value from array
		System.out.println(ids[4]); // 106

		// size of the array in array
		System.out.println(ids.length);

		// In AarrayList---creeating the obj
		ArrayList araylist = new ArrayList<>(); // 10 initial capacity when you call default constructor

		// if you call default constructor---initial capacity =10
		// if you call parameterized constructor--initial capacity will be what number you are passing
		
		
		// adding elements by calling add() 
		araylist.add(101);
		araylist.add(102);
		araylist.add(110);
		araylist.add(110);
		araylist.add(110);
		araylist.add(110);

		// checking size of the arraylist (not the capacity)

		System.out.println(araylist.size());// 6
		//even we can pass size of the diff arraylist obj as a prameter to get capacity
		ArrayList arraylist1 = new ArrayList<>(araylist.size()); // 10
		System.out.println(arraylist1.size());//

	}

}

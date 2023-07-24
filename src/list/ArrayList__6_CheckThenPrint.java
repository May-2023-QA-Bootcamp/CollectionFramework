package list;

import java.util.ArrayList;
import java.util.Iterator;
/*based on condition*/



public class ArrayList__6_CheckThenPrint {

	public static void main(String[] args) {

		//creating list
		ArrayList<String> StudentList = new ArrayList(); 
		// add elements
		StudentList.add("Mehdi");
		StudentList.add("Ruksana");
		StudentList.add("Tanvir");
		
		//calling isEmpty() method to make sure list is emepty or not
		if(!StudentList.isEmpty()) {
			
			//when list is not empty...print all element
			for(String s:StudentList) {
				System.out.println(s);
			}	
			
		}else {
			System.out.println("list is  empty");
		}
		
	}

}

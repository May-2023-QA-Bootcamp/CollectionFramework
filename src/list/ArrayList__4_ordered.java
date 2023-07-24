package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList__4_ordered {

	public static void main(String[] args) {

		ArrayList<String> StudentList = new ArrayList(); // 10 initial capacity when you call default constructor

		StudentList.add("Mehdi");
		StudentList.add("Ruksana");
		StudentList.add("Tanvir");
		
		
		
		
//		if(StudentList.contains("Mehdi")) {
//			System.out.println("yes....he is enrolled");
//		}else {
//			System.out.println("No...he is not enrolled");
//		}
//		1
		
		System.out.println(StudentList.indexOf("Ruksana"));//1
		StudentList.set(1, "Rukshan");
		StudentList.add(1,"Sohag");
		
		System.out.println(StudentList.contains("Mehdi"));

		
		
	}

}

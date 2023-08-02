package list;

import java.util.Collections;
import java.util.Vector;

public class Vector_lowestNumber {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(); // when we create obj with default constructor--capacity=10
		// adding elements
		v.add(1010);
		v.add(105);
		v.add(100);
		v.add(101);// duplicate is possible
		v.add(10);
		v.add(70);
		v.add(1010);
		v.add(18800);
		v.add(120);
		v.add(1090); 
		System.out.println(v.get(0));//1010
		//sorting the data
		Collections.sort(v);
		//getting the lowest one
		System.out.println("Lowest:"+v.get(0));
		System.out.println(v.size());
		
		System.out.println("Highest:"+v.get(v.size()-1));
		
		int lowestNumber=100;
		
		for(int i=0;i<v.size();i++) {
			if(v.get(i)<lowestNumber) {
				lowestNumber=v.get(i);
				
			}
			
			
		}
		
		System.out.println("Lowest Number:"+lowestNumber);
		
		
		int HighestNumber=100;
		
		for(int i=0;i<v.size();i++) {
			if(v.get(i)>HighestNumber) {
				HighestNumber=v.get(i);
				
			}
			
			
		}
		
		System.out.println("Highest Number:"+HighestNumber);

	}

}

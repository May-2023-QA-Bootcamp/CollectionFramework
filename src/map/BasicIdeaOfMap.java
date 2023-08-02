package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BasicIdeaOfMap {
	
	
	/*Store some students information with name and result
	 *    name--maping----Result
	 *    Mehdi----------99
	 *    Shabnin--------100
	 *    Shaila--------98
	 *    
	 * 
	 * */
	
	
	

	public static void main(String[] args) {
		//trying with list---you can store only key/value
		
		ArrayList<String>  list=new ArrayList<>();
		list.add("Mehdi");
		list.add("Shaila");
		list.add("Shabnin");
		
		ArrayList<Integer>  resultlist=new ArrayList<>();
		resultlist.add(99);
		resultlist.add(98);
		resultlist.add(99);
		 
		//after traversing with bothe name and result
		// Mehdi---99   Shaila---98   
		
		
		
		//Map-----key, value pair
		
		//creating map(interface) implemented with HashMap (class)
		Map<String,Integer> map=new HashMap<>(); //it will create  16 buckets
		//adding key-value in map---map.put()
		//key should be unique (no duplicate key)--value can be 
		map.put("Mehdi", 99);
		//map.put("Mehdi", 9);
		//one key, value is an Entry
		map.put("Shaila", 98);
		map.put("Shabnin", 100);
		map.put("Ruksana", 99);
		map.put("Mamun", 98);
		
		//if take all keys----it will keyset
		
		System.out.println(map);
		
		
		
		

	}

}

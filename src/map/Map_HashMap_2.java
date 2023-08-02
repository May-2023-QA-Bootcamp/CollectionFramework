package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_2 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//adding key-value in map---map.put()
		map.put("Mehdi", 99);// Entry-----> one key+value
		map.put("Shaila", 98);
		map.put("Shabnin", 100);
		map.put("Ruksana", 99);
		map.put("Mamun", 98);
		map.put(null, 98);
		
	 
		
		Set<String> keys=map.keySet();
		//in for each loop taking keyset and passing in get()
		for(String k:keys) {
			System.out.println(k+"-"+map.get(k));
		}
		
		System.out.println("******using entrySet()*****");
		
		//using entrySet()---it will return Entry (inner inerface in Map interface)
		//Entry=1key+1value....if we get all entries means a set
		Set<Map.Entry<String, Integer>> entries =map.entrySet();
		
		for(Map.Entry<String, Integer> e:entries) {
			System.out.println(e);
		}
		
		
	}

}

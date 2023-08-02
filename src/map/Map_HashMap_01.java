package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_01 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//adding key-value in map---map.put()
		map.put("Mehdi", 99);// Entry-----> one key+value
		map.put("Shaila", 98);
		map.put("Shabnin", 100);
		map.put("Ruksana", 99);
		map.put("Mamun", 98);
		
		//getting one value by calling get()
		System.out.println(map.get("Shabnin"));   //Shanbnin as a key--match from map
		
		//pring all values
		
		//keySet=all keys togeter---by calling keySet()---it will return and  a Set
		Set<String> keys=map.keySet();
		//in for each loop taking keyset and passing in get()
		for(String k:keys) {
			System.out.println(k+"-"+map.get(k));
		}
		
	}

}

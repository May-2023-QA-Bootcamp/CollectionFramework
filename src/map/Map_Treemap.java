package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map_Treemap {

	public static void main(String[] args) {
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(109, "Mehdi");
		map.put(107, "Mamun");
		map.put(100, "Rukshana");
		map.put(101, "Shabnin");
		map.put(105, "Raquib");
	
		
		System.out.println(map);
		
	Set<Map.Entry<Integer, String>>	entries=map.entrySet();  //it will Entry type
		
		for(Map.Entry<Integer,String >    entry :entries) {
			System.out.println(entry);
		}
		
		
		
	}

	

	}
	


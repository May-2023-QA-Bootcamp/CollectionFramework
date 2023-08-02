package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map_LinkedHahMap {

	public static void main(String[] args) {
		//Make a program to show the lowest temp state name from the mentioned states
		//States(K)-Temp(V)-----get which having lowes temp
		
		Map<String,Integer> statesTemp=new LinkedHashMap<>();
		statesTemp.put("NY", 78);//------this is an Entry
		statesTemp.put("NJ", 77);//------this is an Entry
		statesTemp.put("PA", 80);//------this is an Entry
		statesTemp.put("TX", 85);//------this is an Entry
		statesTemp.put(null, 85);//------this is an Entry
		//NY,NJ,PA,TX---these are keys-----it we take all keys--that will keySet---keySet()
		//if we take all Entry---it will be EntrySet---entrySet()
		
		System.out.println(statesTemp);
		
		//can we return tem--if we pass any state name
		
		//if from system----Scanner class we use
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter states name shortcut--");
		String inputStates=scanner.next();
		System.out.println(statesTemp.get(inputStates));
		
		// lets say you are asked to get the lowest temp state
		System.out.println("-------------------");
		//get all keys
		Set<String> keys=statesTemp.keySet();
		
		//get a variable (for lowest number)
		int lowestemp=78;
		String lowestSt=null;
		
		for(String k:keys) {
			
			if(statesTemp.get(k)<lowestemp) {
				lowestemp=statesTemp.get(k);
				lowestSt=k;
			}
			
		}
		
		System.out.println("LowestTemp State-"+lowestSt+" Tem-"+lowestemp);

	}

}

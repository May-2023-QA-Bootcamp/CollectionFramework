package list;

import java.util.Comparator;

import javax.xml.crypto.dsig.XMLObject;

//we will implements Comparable interface----
public class CompareId implements Comparator<May23> {
	
	
	//105    103   109
	//ascending
	//103 105  109
	//103 105  109
	
	//compare   101 103====101   109
	

	@Override
	public int compare(May23 obj1, May23 obj2 ) {
		
		if(obj1.id>obj2.id) {
			return -1;
		}else {
			return 1;
		}
		  
			}  	
		
	}

	


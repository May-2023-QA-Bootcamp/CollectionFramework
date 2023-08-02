package compareObjects;

import java.util.PriorityQueue;
import java.util.Queue;

//
class FamilyMembers implements Comparable<FamilyMembers>{
	
	String name;
	int age;
	public FamilyMembers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(FamilyMembers o) {
		if(this.age<o.age) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}



public class CompareObj_Comparable {

	public static void main(String[] args) {
		
		FamilyMembers m1 = new FamilyMembers("Sohag",44);
		FamilyMembers m2 =new FamilyMembers("Shimul",34);
		FamilyMembers m3 = new FamilyMembers("Labiba",15);
		FamilyMembers m4 =  new FamilyMembers("Zayan",9);
		
		
		Queue<FamilyMembers> queue=new PriorityQueue<FamilyMembers>();
		queue.add(m1);
		queue.add(m2);
		queue.add(m3);
		queue.add(m4);
		
		
		//peek()---returns not remove top item
		//poll()---returns and removes top item
		//isEmpty()
		
		while(!queue.isEmpty()) {
			//business logic
			
			System.out.println(queue.peek().age+"-"+queue.poll().name);
			
		}
		
		
		
		
	}

}

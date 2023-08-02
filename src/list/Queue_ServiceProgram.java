package list;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_ServiceProgram {

	/*imagine that you are creating queue management program for a customer service centeer
	 * 
	 * (all the time pre-check if there is data or not
	 * 1. first create a quuee obj
	 * 2. add all customer into the queue obj
	 * 3. give service---remove the customer id from the quiue
	 * 4.when there is no customer close...or stop calling (print there is no customer to be served)
	 * */
	
	
	public static void main(String[] args) {
		//creating obj
		Queue<Integer> q=new PriorityQueue<>();
		//Priority is based on the lowest number
		q.add(101);
		q.add(105);
		q.add(100);
		q.add(103);
		q.add(104);
		
		
		
		
		for(int i=0;i<q.size();i++) {
		
		if(!q.isEmpty()) {
			System.out.println("Yes...there is a customer to be served");
			System.out.println("Customer"+q.remove()+"is given service");
			
		}else {
			System.out.println("No more customer");
		}
		
		}

		//System.out.println("Top element"+q.peek());
		
		
		
	}

}

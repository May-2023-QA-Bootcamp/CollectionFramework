package list;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		//creating obj
		Queue<Integer> q=new PriorityQueue<>();
		//Priority is based on the lowest number
		q.add(505);
		q.add(1000);
		q.add(100);
		q.add(103);

		System.out.println("Top element"+q.peek());
		
		for(int i:q) {
			System.out.println(i);
		}
		
		//ACII code
		
		Queue<Character> q1=new PriorityQueue<>();
		//Priority is based on the lowest number
		q1.add('B');
		q1.add('A');
		q1.add('F');
		q1.add('C');
		System.out.println("Top element-"+q1.peek());
		
		for(char j:q1) {
			System.out.println(j);
		}
		
		
		
	}

}

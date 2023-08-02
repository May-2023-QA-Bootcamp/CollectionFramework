package list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuef_CustomizedQueue {
	
	public static void main(String[] args) {
		
		May23 st1=new May23("Mehdi",50);  
		
		May23 st2=	new May23("Abdul",40);
		
		May23 st3=new May23("Boby",22); 
		May23 st4=new May23("Sohag",333); 
		May23 st5=new May23("Shaila",10); 
		
		
		
		Queue<May23>  queue=new PriorityQueue<>(new CompareId());
		queue.add(st1);
		queue.add(st2);
		queue.add(st3);
		queue.add(st4);
		queue.add(st5);
			
		
		
		//dont use for each/iterator
		System.out.println("using iterato--------");
		Iterator<May23> iterator=queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().id);
		}
		
		//
		while(queue.peek()!=null) {
			System.out.println(queue.peek().id+":"+queue.poll().name);
		}
	}

}

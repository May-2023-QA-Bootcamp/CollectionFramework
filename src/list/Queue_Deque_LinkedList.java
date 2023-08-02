package list;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque_LinkedList {

	public static void main(String[] args) {
		Deque<String> dqDeque=new LinkedList<>();
		dqDeque.add("Shbanin");
		dqDeque.offer("Ruksana");
		dqDeque.offerLast("Jahanara");
		dqDeque.addFirst("Shaila");
		dqDeque.offerFirst("Jhony");
		dqDeque.addLast("Tanvir");
		
		System.out.println(dqDeque.peek());
		System.out.println(dqDeque.remove()); //Retrieving top element and removing
		System.out.println(dqDeque.remove());
		
		//System.out.println(dqDeque.removeFirst());
		//System.out.println(dqDeque.removeLast());////retriving top element and removing
		
		System.out.println(dqDeque.element());
		System.out.println(dqDeque.element());
		
		
		
		
		
		
		

	}

}

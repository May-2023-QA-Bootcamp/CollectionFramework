package list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque_ArrayDeque {

	public static void main(String[] args) {
		Deque<String> dqDeque=new ArrayDeque<>();
		dqDeque.add("Shbanin"); //top /head
		dqDeque.add("Ruksana");
		dqDeque.add("Jahanara");
		dqDeque.addLast("Shaila");
		dqDeque.addFirst("Jhony");
		dqDeque.add("Tanvir"); //last /tail
		dqDeque.add("A");
	
		
		System.out.println(dqDeque.getFirst()); //getting element from top
		System.out.println(dqDeque.getLast()); //getting element from bottom
		
		System.out.println(dqDeque.peek());
		System.out.println(dqDeque.remove()); //Retrieving top element and removing
		System.out.println(dqDeque.remove());
		
		//System.out.println(dqDeque.removeFirst());
		//System.out.println(dqDeque.removeLast());////retriving top element and removing
		
		System.out.println(dqDeque.element());
		System.out.println(dqDeque.element());
		

	}

}

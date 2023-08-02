package list;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque_LinkedList2_CompareMethods {

	public static void main(String[] args) {
		Deque<String> dqDeque=new LinkedList<>();
		//dqDeque.offer("Ruksana");  //top
		//dqDeque.add("Shbanin");
		
		//same for both cases
		dqDeque.add("Shbanin");  //top
		dqDeque.offer("Ruksana");
		
		System.out.println(dqDeque.peek()); 
		
		
		Deque<String> dqDeque1=new LinkedList<>();
		dqDeque1.offer("Sohag"); //top
		dqDeque1.offer("Tanvir");
		
		//compare remove() and poll() 
		
		//System.out.println(dqDeque1.remove()); //will retrive and remove top element
		//System.out.println(dqDeque1.remove());
		//System.out.println(dqDeque1.remove());
		
		System.out.println(dqDeque1.poll()); //will retrive and remove top element
		System.out.println(dqDeque1.poll());
		System.out.println(dqDeque1.poll());
		
		
		System.out.println(dqDeque1.peek()); //will return null (as there is no element)
		System.out.println(dqDeque1.element()); //will throw an NoSuchElementException(as there is no element)
		
		

	}

}

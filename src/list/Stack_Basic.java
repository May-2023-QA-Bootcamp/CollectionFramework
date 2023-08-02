package list;

import java.util.ListIterator;
import java.util.Stack;

public class Stack_Basic {

	public static void main(String[] args) {
		//***Stack is LIFO
		
		//creating obj of Stack
		Stack<String> list=new Stack<>();
		list.add("Shabnin");//First   Tail
		list.add("Mehdi");
		list.add("Tanvir");
		list.addElement("Tofayel");
		list.insertElementAt("Lobid", 1);
		list.push("Nasir");
		list.add("Sohag");//Last   Head
		
		//call peek() to get the top item--head or last item
		System.out.println(list.peek());
		//listIterator()---it is applicable for collection (stack)
		ListIterator<String> lit	=list.listIterator(list.size());
		System.out.println("using hasPrevious() and previous()------");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		System.out.println("using hasNext() and next()------");
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		
		

	}

}
